

##Exercici de conversor de decimal a hexadecimal
print("Conversor de decimal a hexadecimal")

valoresHexadecimales='012345678ABCDEF'##guardamos los caracteres validos para la conversión.


def conv10_16(numero):
    if numero <= 8 :
        return valoresHexadecimales[numero]
    else:
        
