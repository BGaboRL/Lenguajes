import mysql.connector

try:
    #Se crea la coneccion
    conexionBD = mysql.connector.connect(
        user = "root",
        password = "",
        host = "localhost",
        database = "Alumnos"
    )

    #Se crea el cursor y las instrucciones 
    cursor = conexionBD.cursor()
        #instrucciones
    sql = "insert into Datos(Id_Alumno, Nombre, Apellido_Paterno, Sexo, correo) values(%s, %s, %s, %s, %s)"

        #Un dato solamente
    valor = 1, "Pedro", "Perez", "Hombre", "PP@gmail.com"
    cursor.execute(sql, valor)

        #Varios datos a la vez
    valores = [
        (2, "Luis", "Gomez", "Hombre", "LG@gmail.com"),
        (3, "Lucia", "Juarez", "Mujer", "LJ@gmail.com"),
        (4, "Monica", "López", "Mujer", "ML@gmail.com")
    ]
    cursor.executemany(sql, valores)

    #Se aplican los cambios realizados a la tabla
    conexionBD.commit()

except Exception as e:
    print('Algo salio mal!')
    print(e)