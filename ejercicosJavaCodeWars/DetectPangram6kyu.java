public class PangramChecker {
    public boolean check(String sentence){
      int cont = sentence.toLowerCase()
                  .replaceAll("[^a-z]", "")
                  .replaceAll("(.)(?=.*\\1)", "")
                  .length();
      
      return cont == 26;
      
    }
  }