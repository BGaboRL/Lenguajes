import random

datos = ["piedra", "papel", "tijera"]

usuario = input("Que eliges piedra, papel o tijera: ")
maquina = random.choice(datos)

if usuario in datos:
    if usuario == "piedra" and maquina == "tijera" or usuario ==  "papel" and maquina == "piedra" or usuario == "tijera" and maquina == "papel":
        print("Tu ganas!")
    elif usuario == maquina:
        print("Empate!")
    else:
        print("Tu pierdes!")
else:
    print("Dato no valido!")

print(f"Elegi {maquina}")