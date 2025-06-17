#pip install streamlit gTTS
#Para ejecutar es en cosola con el comando: streamlit run NombreDelArchivo.py
import streamlit
from gtts import gTTS

    #Se crea un titulo para el treamlit
streamlit.title("Generador de Audio OpenIA")
    #Se crea el area de texto con altura de 200
texto = streamlit.text_area("Ingrese el texto:", height=200)
    #Se crea el select para las voces

if streamlit.button("Generar Audio"):
    if texto:
        #Se crea un archivo y se le guarda el archivo de audio generado
        audio = "audio.mp3"
        lenguaje = "es-us"
        with open(audio, "wb") as archivo_salida:
            speach = gTTS(text = texto, lang = lenguaje, slow = False)
            speach.save(audio)

        #Si todo sale bien se envia un mensaje de exito
        streamlit.success("Audio generado y guardado en audio.mp3")

        #Se habre el audio para poderlo reproducir
        archivo_audio = open(audio, "rb")
        lectura_audio = archivo_audio.read()
        streamlit.audio(lectura_audio, format="audio/mp3")
    else:
        streamlit.error("Por favor, ingrese un texto!")