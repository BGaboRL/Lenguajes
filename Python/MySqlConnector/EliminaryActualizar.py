import mysql.connector

conexionBD = mysql.connector.connect(
        user = "root",
        password = "",
        host = "localhost",
        database = "Alumnos"
    )

cursor = conexionBD.cursor()
    #Eliminar una fila completa utilizando una condicion
cursor.execute("Delete From Datos Where Id_Alumno = 1")

    #Actualizar el dato de una fila
d = "María",4
cursor.execute("update Datos set Nombre = %s where Id_Alumno = %s", d)

conexionBD.commit()

conexionBD.close()