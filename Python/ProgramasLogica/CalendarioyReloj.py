import datetime
import calendar
import os
import time

a = 1
while (a != 0):
    fecha = datetime.datetime.now()                             ##Forma mas larga de hora
    actual = fecha.strftime('Hora: %H:%M:%S Del dia: %A (%d)')  #hora = fecha.hour
                                                                #minuto = fecha.minute
                                                                #segundo = fecha.second
    mes = int(fecha.month)
    anio = int(fecha.year)
    calendario = calendar.month(anio, mes)

    print(f"{actual} \n\n{calendario}")

    time.sleep(1)
    os.system("clear")
