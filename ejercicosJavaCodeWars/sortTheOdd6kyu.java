import java.util.*;
public class Kata {
  public static int[] sortArray(int[] array) {
    List<Integer> oddNumbers = new ArrayList<>();

        // Almacenar los números impares y sus índices originales
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddNumbers.add(array[i]);
            }
        }

        // Ordenar los números impares
        Collections.sort(oddNumbers);

        // Iterar sobre el arreglo original y reemplazar los números impares ordenados
        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddNumbers.get(oddIndex++);
            }
        }

        return array;
  }
}