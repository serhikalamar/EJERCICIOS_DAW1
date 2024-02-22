
//el ejercicio que tenemos es recorrer un array bidimensional de forma de espiral.es basicamente como un cuadrado.
//array = [[1,2,3],
//        [4,5,6],
//        [7,8,9]]
//        snail(array) #=> [1,2,3,6,9,8,7,4,5]
//
import java.util.ArrayList;
public class Snail {

    public static int[] snail(int[][] array) {
     // enjoy
    int[] cabezon = new int[array.length * array[0].length]; //aqui el array es (length por length [0]) para saber la base por altura 
                                                            // y saber cuantos valores metemos, mas que nada para tener una array ordenada de forma espiral
    int contadorPosicionArray = 0; //ir guardando la posicion de la array "cabezon" para no añadir de mas
    int perimetro = 0; // en este ejercicio necesitamos tener el inicio del array controlado y el final porque lo vamos sumando para que se vaya reduciendo
    int longitudArray = array.length; // guardamos el largo para ir reduciendo y controlando los valores y dar una vuelta repetida al exterior del cuadrado.

    //Miramos si la array esta vacia o con solo un valor.
    if(array.length == 0 || array.length == 1){
        return array[0] ;
    }

    //Creamos un for para controlar las vueltas que necesitas para llegar a todos los valores.
    for (int j = 0; j < longitudArray; j++) {
        // primera parte del array recorremos la fila 0 todos los numeros y los guardamos en una array de una dimenson.
        for (int i = perimetro; i < longitudArray; i++) {
            cabezon[contadorPosicionArray] = array[perimetro][i];
            contadorPosicionArray++;
        }
        // recorremos la array por el lado exterior derecho de arriba a abajo empezando por la fila 1 ya que el primer numero de la fila 0 ya lo tenemos
        for (int i = perimetro + 1; i < longitudArray; i++) {
            cabezon[contadorPosicionArray] = array[i][longitudArray - 1];
            contadorPosicionArray++;
        }
        // ahora recorremos el lado exterior del cuadrado, la zona de abajo y la recorremos de derecha a izquierda y sin coger el primer numero porque ya lo tenemos cogido
        for (int i = longitudArray - 2; i >= perimetro; i--) {
            cabezon[contadorPosicionArray] = array[longitudArray - 1][i];
            contadorPosicionArray++;
        }
        //y aqui el exterior de abajo a arriba y sin coger el ultimo otra vez
        for (int i = longitudArray - 2; i > perimetro; i--) {
            cabezon[contadorPosicionArray] = array[i][perimetro];
            contadorPosicionArray++;
        }
        //añadimos un ++ al perimetro para reducir el cuadrado de una esquina y la longitud  de la otra esquina asi tambien  se hace un cuadrado mas pequeño
        perimetro++;
        longitudArray--;
    }
    // devolvemos la array para que el test compruebe si esta en el orden que toca <3
    return cabezon;
 }
}