import java.util.ArrayList;
public class Snail {

    public static int[] snail(int[][] array) {
     // enjoy
      int[] cabezon = new int[array.length * array[0].length];
    int contadorPosicionArray = 0;
    int perimetro = 0;
    int longitudArray = array.length;
      if(array.length == 0 || array.length == 1){
        return array[0] ;
      }
    for (int j = 0; j < longitudArray; j++) {
        for (int i = perimetro; i < longitudArray; i++) {
            cabezon[contadorPosicionArray] = array[perimetro][i];
            contadorPosicionArray++;
        }
        for (int i = perimetro + 1; i < longitudArray; i++) {
            cabezon[contadorPosicionArray] = array[i][longitudArray - 1];
            contadorPosicionArray++;
        }
        for (int i = longitudArray - 2; i >= perimetro; i--) {
            cabezon[contadorPosicionArray] = array[longitudArray - 1][i];
            contadorPosicionArray++;
        }
        for (int i = longitudArray - 2; i > perimetro; i--) {
            cabezon[contadorPosicionArray] = array[i][perimetro];
            contadorPosicionArray++;
        }
        perimetro++;
        longitudArray--;
    }

    return cabezon;
 }
}