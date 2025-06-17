import random
import time

hola = "h o l a m u n d o !".split()
si = False
i = 0
pal = ""
while(si == False):
    a = random.choice(hola)
    
    if a == hola[i]:
        pal += hola[i]
        i += 1

    if i < (len(hola)):
        print(pal + a)
        time.sleep(0.1)
    
    if pal == "hola":
        pal += " "

    elif pal == "hola mundo!":
        print(pal)
        si = True