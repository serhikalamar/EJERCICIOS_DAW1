public static int[] snail(int[][] array) {
        // enjoy
        //  int[] cabezon = new int[];
        ArrayList<Integer> cabezon2 = new ArrayList<>();
        int a = 0;
        int c = 0;
        int d = array.length;
        for(int j = 0 ; j < array.length;j++, a++){
            for(int i = c ; i < d;i++){
                //cabezon[a] = array[c][i];
                cabezon2.add(array[c][i]);
            }
            for(int i = c + 1 ; i < d; i++,a++){
                //cabezon[a]= array[i][c+1];
                cabezon2.add(array[i][c+1]);

            }
            for(int i = d - 1; i <= 0 ; i--,a++){
                // cabezon[a] = array[d][i];
                cabezon2.add(array[d][i]);
            }
            for(int i = array.length -1; i >= 0; i--, a++){
                // cabezon[a] = array[i][c];
                cabezon2.add(array[i][c]);
            }
            c++;
            d--;
        }
        return cabezon2;
    }