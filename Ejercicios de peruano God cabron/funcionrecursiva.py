##creamos una funcion para pasar de decimal a hexadecimal

##Construeix una funció recursiva 'conv10_16' que converteixi de decimal a hexadecimal
print("Conversor de hexadecimal")

def conv10_16(numero):
    
    hexadecimal="0123456789ABCDEF" #guardamos los símbolos que podemos usar en la funcion
    
    if numero <= 15 : #si "numeoro" es menor o igual que 15 se ejecuta esta condicion
        return hexadecimal[numero]
    else:
        quocient = numero // 16 #guardamos el quociente en una variable
        reste = numero % 16  #guardamos el resto en una variable

        return conv10_16(quocient) + hexadecimal[reste] #volvemos a ejecutar la funcion guardando el resto 
    

    
print(conv10_16(3587))