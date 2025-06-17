import mysql.connector

conexionBD = mysql.connector.connect(
        user = "root",
        password = "",
        host = "localhost",
        database = "Alumnos"
    )

cursor = conexionBD.cursor()
cursor.execute("Select * From Datos")
#Se reciben los datos en un arreglo
resultado = cursor.fetchall()
for i in resultado:
    print(i)    ##(0, 'Gabriel', 'Rodíguez', 'Hombre', 'B.G.R.L1999@gmail.com')
    #print(*i)  ##0 Gabriel Rodíguez Hombre B.G.R.L1999@gmail.com

conexionBD.close()