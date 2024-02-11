public class Solution {
    public static int minimumNumber(int[] numbers) {
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers[i];
        }
        int primoCercano = encontrarPrimoCercano(suma);
    
        int diferencia = primoCercano - suma;
        return diferencia;
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int encontrarPrimoCercano(int num) {
     
        if (esPrimo(num)) {
            return num;
        }

        int mayorPrimo = num + 1;
        while (true) {
            if (esPrimo(mayorPrimo)) {
                return mayorPrimo;
            }
            mayorPrimo++;
        }
    }
}
