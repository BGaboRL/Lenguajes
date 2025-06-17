#Verificar si dos cadenas son anagramas osea que se puede formar la primer con la segunda
#y viceversa: listen - silent sin repetir letras solo reordenado se forma la misma palabra

tex1 = input("Primera cadena: ")
tex2 = input("Segunda cadena: ")

tex11 = sorted(''.join(tex1.lower()))
tex21 = sorted(''.join(tex2.lower()))

if tex11 == tex21:
    print("Son anagramas!")
else:
    print("No son anagramas!")
