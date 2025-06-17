import string
import random
import hashlib

def crear():
    longitud = int(input("Ingrese el tamaño de la contraseña: "))

    #Obtine y concatenas letras(MAY/MIN), numeros (0-9), signos de puntuacion
    caracteres = string.ascii_letters + string.digits + string.punctuation

    #Une caracteres al string uno a la ves la cantidad de veces que indica el usuario
    contrasenia = "".join(random.choice(caracteres) for i in range(longitud))

    a = input("La quieres encriptar? si/no\n").lower()
    
    if a == 'si':
        print(f"Contraseña: {contrasenia}")
        h = hashlib.sha256(contrasenia.encode()).hexdigest()
        print(f"Haseada: {h}")
    else:
        print(f"Contraseña: {contrasenia}")

def hasheo():
    password = input("Ingresa la contraseña: ")
    # = 'crea el objeto utilizando sha256'(codifica la frase en bytes)."obtiene el formato en hexadecimal"
    salida = hashlib.sha256(password.encode()).hexdigest()
    print(f"Hasheada: {salida}")

print("Que deceas hacer?")
opt = int(input("1. Crear \n2. Encriptar \n"))

crear() if opt ==1 else hasheo()