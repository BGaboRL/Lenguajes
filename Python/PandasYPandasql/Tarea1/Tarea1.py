import pandas
import pandasql
import os
import mysql.connector as mycon

try:
    #Realiza la cosulta para almacenar los datos que se tienen que cambiar
    archivo = pandas.read_csv("sales_transactions_unique.csv")
    
    consulta = "SELECT * FROM archivo WHERE customer_email NOT LIKE \"%@%\""
    resultado = pandasql.sqldf(consulta, locals())

    c = "cambios.csv"
    i = 0
    while os.path.exists(c):
        i += 1
        c = f"cambios_{i}.csv"
    resultado.to_csv(c, index=False)

    #Una ves cargado el archivo a una BD se hace la coneccion a la misma
    conexionBD = mycon.connect(
        user = "root",
        password = "",
        host = "localhost",
        database = "sales"
    )
    cursor = conexionBD.cursor()
    
    #Actualiza los correos y coloca en cero los valores negativos
    cursor.execute('UPDATE sales_transactions_unique SET customer_email = CONCAT(SUBSTRING_INDEX(customer_email, "example",1), "@example.com") WHERE customer_email NOT LIKE "%@%"')
    cursor.execute('UPDATE sales_transactions_unique SET transaction_amount = 0 WHERE transaction_amount < 0')

    conexionBD.commit()
    
    ##Genera el archivo nuevo
    #Realiza la consulta y almacena el nombre de las columnas con un lista por comprención
    cursor.execute("SELECT * FROM sales_transactions_unique")
    columnas = [i[0] for i in cursor.description]

    #Obtine todos los resultados de la consulta y crea un DF agregando estos y si respectivo nombre de columnas
    resultado2 = cursor.fetchall()
    df = pandas.DataFrame(resultado2, columns=columnas)
    
    #Crea el archivo de salida
    df.to_csv("sales_transactions_cleaned.csv", index=False)

    cursor.close()
    conexionBD.close()

    print("Cambios realizados con exito!")

except Exception as exc:
    print("Hubo un error: ", exc)
