#pip install streamlit gTTS
#Para ejecutar es en cosola con el comando: streamlit run NombreDelArchivo.py

import streamlit
import string
import random
import hashlib

streamlit.title("Generador de contraseñas")
opcion = streamlit.selectbox("Opciones:",["Crear", "Hashear"])

if opcion == "Crear":
    longitud = streamlit.number_input("Ingrese el tamaño de la contraseña: ", min_value=0, value=8, step=1)

    #Obtine y concatenas letras(MAY/MIN), numeros (0-9), signos de puntuacion
    caracteres = string.ascii_letters + string.digits + string.punctuation

    #Une caracteres al string uno a la ves la cantidad de veces que indica el usuario
    contrasenia = "".join(random.choice(caracteres) for i in range(longitud))

    streamlit.text_input("Contraseña:", contrasenia)
    opcion2 = streamlit.selectbox("La quieres hashear:", ["No", "Si"])
    if opcion2 == "Si":
        salida = hashlib.sha256(contrasenia.encode()).hexdigest()
        streamlit.text(salida)

else:
    password = streamlit.text_input("Ingresa la contraseña:")
    # = 'crea el objeto utilizando sha256'(codifica la frase en bytes)."obtiene el formato en hexadecimal"
    salida = hashlib.sha256(password.encode()).hexdigest()
    streamlit.text(salida)
