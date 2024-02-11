public class Solution {

    public int solution(int number) {
      //TODO: Code stuff here
      int total = 0;
      for(int i = 0; i < number;i++){
        if(i % 3 == 0 || i % 5 == 0){
          total += i;
        }
      }
      return total;
    }
  }