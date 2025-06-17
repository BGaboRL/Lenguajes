#pip install mysql-connector-python
import mysql.connector

#crear conexion con la BD
conexion = mysql.connector.connect(
    user = "root",
    password = "",
    host = "localhost"
)

#Se crea un cursor (objeto que permite ejecutar consultas y manejar resultados)
#Este cursor genera y almacena la instruccion que muestra todas las BD existentes
cursor = conexion.cursor()
cursor.execute("show databases")

for base in cursor:
    print(base)

#Se cierra la coneccion con la BD
conexion.close()



print()
    #Ejemplo 2 Obtener datos de una tabla de una BD especifica
#creando la coneccion
conexion2 = mysql.connector.connect(
    user = "root",
    password = "",
    host = "localhost",
    database = "Alumnos"
)

#creando un cursor
conector2 = conexion2.cursor()
conector2.execute("Select * From Datos")

#Imprimiendo datos
for fila in conector2:
    print(fila)

#terminando la coneccion
conexion2.close()