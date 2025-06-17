a = 0
b = 1
x = 1
print("0 1", end=" ")

rango = int(input('Rango: '))
for i in range(rango):
    c = a + b
    a = b
    b = c
    x += c
    print(c, end=" ")
print(x*4)