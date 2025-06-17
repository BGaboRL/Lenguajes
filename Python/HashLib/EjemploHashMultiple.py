import hashlib

m = hashlib.sha256()
m.update(b"Secuencia 1")
m.update(b"Secuencia 2")
m.update(b"Secuencia 3")
salida = m.hexdigest()

print(salida)