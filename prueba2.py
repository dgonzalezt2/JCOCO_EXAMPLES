x = int(input('Ingrese el valor de a: \n'))
sqroot=0
while sqroot*sqroot<x:
    sqroot=sqroot+1
    print(sqroot)

if sqroot*sqroot > x:
    sqroot = sqroot-1
    
print('La raiz cuadrada de ', x, ' es ', sqroot)