"""Se consume una API para obtener la frase del dia"""

import requests, json

URL = "https://frasedeldia.azurewebsites.net/api/phrase"

respuesta = requests.get(URL)
frase = respuesta.json()

print("Frase: ")
print(frase ["phrase"])

print("\nAutor: ")
print(frase ["author"])
