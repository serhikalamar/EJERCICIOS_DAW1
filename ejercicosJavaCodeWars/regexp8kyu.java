public class StringUtils {
  
    public static boolean isDigit(String s) {
      // your code goes here
      String conf = "[0-9]";
      boolean si = false;
      if(s.matches(conf)){
        si = true;
      }else{
        si = false;
      }
      
      return si;
    }
  }