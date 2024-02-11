import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
    
    String guion = "-";
    String bajo = "_";
    String cambio = s;
    cambio.toUpperCase();
    if ( s == "" || s.isEmpty()){
      return s; 
    }
    StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '-' || currentChar == '_') {
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(currentChar));
                    capitalizeNext = false;
                } else {
                    result.append(currentChar);
                }
            }
        }

        return result.toString();
  }
}