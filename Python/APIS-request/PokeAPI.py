import requests

p = input("Nombre o ID Pokemon: ")

try:
    url = f"https://pokeapi.co/api/v2/pokemon/{p}"
    respuesta = requests.get(url)

    if respuesta.status_code == 200:
        pokemon = respuesta.json()

        print(f"Nombre: {pokemon['name']}")
        print(f"Numero en la pokedex: {pokemon['id']}")
        print("Tipos:")
        for tipo in pokemon['types']:
            print(f"- {tipo['type']['name']}")
    
    else:
        print("Pokemon no encontrado!")

except Exception:
    print("Fallo en la conexion!")