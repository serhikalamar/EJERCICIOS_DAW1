public class Solution
{
    public static long maxProduct(int[] numbers, int sub_size){
      int numberL = numbers.length;
      long multiplicacion = 1;
      for (int i = 0; i < sub_size; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < numberL; j++) {
                if (numbers[j] > numbers[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the found maximal element with the element at position i
            int temp = numbers[i];
            numbers[i] = numbers[maxIndex];
            numbers[maxIndex] = temp;

            multiplicacion *= numbers[i];
        }
        return multiplicacion; // Do your magic!
    }
   
}