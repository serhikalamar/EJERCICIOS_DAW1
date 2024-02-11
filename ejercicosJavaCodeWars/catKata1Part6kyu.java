public class PeacefulYard {
    public static boolean peacefulYard(String[] yard, int minDistance) {
       int fila = 0;
        int colum = 0;
        for(int i = 0;i < yard.length;i++){
            for(int j = 0;j < yard[i].length(); j++){
              fila = i;
              colum = j;
            }
        }  
          
        int[][] cats = new int[fila][colum];
        int count = 0;

        for(int i = 0;i < yard.length;i++){
            for(int j = 0;j < yard[i].length(); j++){
              char posi = yard[i].charAt(j);
              if(posi == 'L' || posi == 'M'|| posi == 'R'){
                cats[count][0] = i;
                cats[count][1] = j;
                count++;
              }
            }
        }

        for(int i = 0; i < count; i++){
            for(int j = i + 1; j < count; j++){
              int dx = cats[i][0] - cats [j][0];
              int dy = cats[i][1]- cats [j][1];          
              double dis = (int) Math.sqrt(dx * dx + dy * dy);
              
              if(dis < minDistance){
               return false; 
              }
                
            }
        }
        return true;
    }
}