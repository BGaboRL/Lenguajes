#Palindromo
frase = input("Ingresa una frase o palabra: ")
frasein = ''
a = len(frase) - 1

for i in range(a, -1, -1):
    frasein += frase[i]

x = frase.upper().replace(" ","")
y = frasein.upper().replace(" ","")

if x == y:
    print("Es palindromo!")
else:
    print("No es palindromo!")

###Solucion 2
#text = input("Ingresa un texto: ")
#
###Quitar todos los espacios...
#text = text.replace(' ', '')
#
###... Y revisar si la palabra es igual en ambos sentidos
#if len(text) > 1 and text.upper() == text[::-1].upper():
#    print('Es palindromo!')
#else:
#    print('No es palindromo!')