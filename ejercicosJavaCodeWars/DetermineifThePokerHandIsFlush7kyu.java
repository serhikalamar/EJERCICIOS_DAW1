public class Kata{
    public static boolean CheckIfFlush(String[] cards){
      boolean letra = true;
    
      if(cards[0].contains("H")){
        for(int i = 0 ; i < cards.length;i++){
          if(!cards[i].contains("H")){
            letra = false;
          }
        }
      }
      if(cards[0].contains("S")){
        for(int i = 0 ; i < cards.length;i++){
          if(!cards[i].contains("S")){
            letra = false;
          }
        }
      }
      if(cards[0].contains("D")){
        for(int i = 0 ; i < cards.length;i++){
          if(!cards[i].contains("D")){
            letra = false;
          }
        }
      }
      if(cards[0].contains("C")){
        for(int i = 0 ; i < cards.length;i++){
          if(!cards[i].contains("C")){
            letra = false;
          }
        }
      }
      return letra; 
    }
  }