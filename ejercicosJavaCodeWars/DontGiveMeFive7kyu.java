public class Kata
{
  public static int dontGiveMeFive(int start, int end){
    int contador = 0;
    for(int i = start ; i <= end; i++){
      String num = i+"";
      if(!String.valueOf(num).contains("5")){
        contador++;
      }
    }
    return contador;
  }
}