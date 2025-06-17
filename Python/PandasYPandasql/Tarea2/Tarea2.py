import pandas
import mysql.connector as mycon
import matplotlib.pyplot as plt

try:
    #Crea la coneccion con la BD una ves que se carga el archivo csv
    conexion = mycon.connect(
        user = "root",
        password = "",
        host = "localhost",
        database = "sales"
    )

    cursor = conexion.cursor()

    #Se almacenan las consultas a realizar
    consultas = [
        "SELECT hotel_name, SUM(nights) AS total FROM hotel_bookings_unique WHERE status = 'confirmed' GROUP BY BINARY hotel_name ORDER BY total DESC LIMIT 1",
        "SELECT room_type, SUM(price_per_night) AS total FROM hotel_bookings_unique WHERE status = 'confirmed' GROUP BY room_type ORDER BY total DESC LIMIT 1",
        "SELECT hotel_name, SUM(price_per_night) AS total FROM hotel_bookings_unique WHERE status = 'confirmed' GROUP BY BINARY hotel_name"
    ]

    #Abre o crea el archivo para escribir
    with open("Resultados.txt", "+tw") as archivo:
        i = 0
        #Ejecuta cada consulta cargada previamente una por una
        for consulta in consultas:
            i+=1
            cursor.execute(consulta)
            resultado = cursor.fetchall()

            if i == 1:
                archivo.write("Hotel con mayor número de reservas? \n")
            if i == 2:
                archivo.write("\nHabitación con mayor ingreso por noche? \n")
            if i == 3:
                archivo.write("\nTotal de ingresos confirmados por hotel: \n")
            
            #Escribe el resultado en el archivo agregandole un salto de linea al final de cada linea
            for fila in resultado:
                archivo.write(f"{fila} \n")


    print("Archivo \"Resultados\" creado con exito!")

    #Realiza la consulta y la carga en un DataFrame
    df = pandas.read_sql_query(consultas[2], conexion)
    
    #Cierra la conexión con la BD
    cursor.close()
    conexion.close()

    ##Crea el grafico añadiendo una dimecion, las variables a usar donde ira cada tipo y un titulo
    plt.figure(figsize=(10,6))
    plt.bar(df['hotel_name'], df['total'], color='blue')
    plt.xlabel('Hoteles')
    plt.ylabel('Total ingresos')
    plt.title('Ingresos por hotel')
    plt.xticks(rotation=45)
    #Ajusta el tamaño de diseño para que no se corten las etiquetas
    plt.tight_layout()

    #Guarda el resultado y al final lo muestra
    plt.savefig('ingresos_por_hotel.png')
    #plt.show()

except Exception as exc:
    print(f"Ocurrio un error: {exc}")


