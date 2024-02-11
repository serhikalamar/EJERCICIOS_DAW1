class Solution{
    public static int solve(int [] arr){  
        //..
      int total = 0;
      for(int i = 0; i < arr.length;i++){
        if(esprimo(i)){ total +=arr[i]; }
      }
      return total;
    }  
  public static boolean esprimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}