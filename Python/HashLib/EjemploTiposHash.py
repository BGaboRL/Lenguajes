import hashlib

print(hashlib.sha256(b"El Libro de Python").hexdigest())
print(hashlib.sha224(b"El Libro de Python").hexdigest())
print(hashlib.sha512(b"El Libro de Python").hexdigest())
print(hashlib.blake2b(b"El Libro de Python").hexdigest())
print(hashlib.blake2s(b"El Libro de Python").hexdigest())
print(hashlib.md5(b"El Libro de Python").hexdigest())