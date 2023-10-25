def potencia (b,e):
    if e == 1:
        return b
    else:
        return b * potencia(b, e-1)


print(potencia(7,2))
### creamos esta funcion que se va restando a ella misma hasta llegar a 1 y se cierra el bucle.

def invertir(caracter):
    if caracter == '':##pide un caracter vacio porque cuando acaba el bucle invirtiendo todo llega a un punto de limite
        # de vacio donde no hay caracter y nada y es cuando corta el bucle
        return ''
    else:
        return invertir(caracter[1:]) + caracter[0]
    
### creamos esta funcion que va aislando el primer caracter hasta invertir la palabra completa #####

def sumarlista(numeros):
    if numeros == '':
        return ''
    else:
        return sumarlista(numeros[1:]) + numeros[0]
print(sumarlista(7,-9,4,10))


def conv10_2_asc(numero):
# Aquesta funció la cridarem només amb un paràmetre, el número decimal a convertir

# Considerarem com casos base convertir 0 i 1 de decimal a binari:
    if numero <= 1:
        return str(numero)
    else:
        quocient = numero // 2
        reste = str(numero % 2)
        return conv10_2_asc(quocient) + reste
    


import math

def conv10_2_desc(numero, exponent = None):
# Aquesta funció la cridarem només amb un paràmetre, el número decimal a convertir
# El paràmetre exponent quedarà buit (None) per defecte. Només el faran servir les cridades recursives.

# El nostre cas base:
    # Volem convertir 0 ò 1 de decimal a binari.
    # Això pot ser a causa de cridar conv10_2_desc(0) o conv10_2_desc(1) de manera que exponent == None
    # o bé, si venim d'una cridada recursiva i ja hem arribat al final amb una
    # cridada conv10_2_desc(0,0) o conv10_2_desc(1,0)
    if (numero == 0 or numero == 1) and (exponent == 0 or exponent == None):
        return str(numero)
    else:
        if exponent == None:
            # Només en el cas d'una cridada primera.
            # Calculam quina potència de 2 farem servir per començar la conversió
            exponent = math.floor(math.log(numero,2))

        if numero >= 2**exponent:
            return '1' + conv10_2_desc(numero - 2**exponent, exponent - 1)
        else:
            return '0' + conv10_2_desc(numero, exponent - 1)