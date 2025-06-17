import hashlib

##Forma corta
salida = hashlib.sha256(b"El Libro De Python").hexdigest()
print(salida)

#Forma larga
m = hashlib.sha256()
m.update(b"El Libro De Python")
salida = m.hexdigest()
#print(salida)