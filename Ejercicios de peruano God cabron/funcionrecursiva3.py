
#esta funcion es importante porque os muestra como el "1" del else se va acumulando por cara vuelta del 
# programa y hasta que no se cierra el ciclo no se suman ose si da 4 vueltas se suma 4 veces 1
def mistery (a,b):
    q = a // b 
    
    if q == 0:
        return 1
    else:
        return 1 + mistery(q,b)
    
print(mistery(15,7))
