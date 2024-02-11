class Solution{
    public static int repeats(int [] arr){
      int sumar = 0 ;
      boolean repetir = false;
        for(int i = 0 ; i < arr.length; i++){
          for(int b = i + 1; b < arr.length;b++){
            if (arr[i] == arr[b]){
              arr[b] = 0; 
              repetir = true;
            }
          }
          if(repetir){
            repetir = false;
            arr[i] = 0;
          }
        }
      for(int c = 0; c < arr.length ; c++){
        sumar += arr[c];
      }
      return sumar;
    }
}