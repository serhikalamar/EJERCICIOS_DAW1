
##Crea una funció anomenada 'esInvertible'. Aquesta funció ha de rebre una cadena i retornar 'True' si i només si la paraula s'escriu igual de dreta a esquerra o d'esquerra a dreta. 'False' en cas contrari.

def esInvertible (paraula):
    if paraula == paraula[::-1]: #si la palabra es igual que la otra invertida se ejecuta la condicion
        return True #nos devuelve True el programa
    else :  #si palabra no es igual invertida
        return False  #nos devuelve False el programa

print(esInvertible('abba'))
