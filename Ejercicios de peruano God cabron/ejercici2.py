
l=[7, -9 , 4, 10]

def sumarlista(lista):
    if len(lista) == 0:
        return 0
    else:
        return sumarlista(lista[1:]) + lista[0]

print(sumarlista(l))



def sumarlista(lista):
    if lista == []:
        return 0
    else:
        return sumarlista(lista[:-1]) + lista[-1]
    
