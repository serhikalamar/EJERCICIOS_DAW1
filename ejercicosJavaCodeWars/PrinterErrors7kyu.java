public class Printer {
    
    public static String printerError(String s) {
        int error = 0 ;
        String expresion = "[a-m]";
        for(int i = 0 ; i < s.length(); i++ ){
          if(s.charAt(i) < 'a' || s.charAt(i) > 'm'){
            error++;
          }
        }
        return error +  "/" + s.length();
      }
      
}