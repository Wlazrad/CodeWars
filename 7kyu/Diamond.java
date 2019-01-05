package com.wlazly;

public class Diamond {
    public static String print(int n) {
        String[][] diamond = new String[n][n];
            for (int i =0; i<diamond.length;i++){
                for(int j=0; j<diamond[0].length;j++){
                   diamond[i][j]="*";
                }
            }
        System.out.println(diamond[0].length);




        //dol lewo
        for (int i =(n/2)+1; i<diamond.length;i++){
            for(int j=0; j<i/2;j++){
                diamond[i][j]=" ";
            }
        }
        //dol prawo
        for (int i =(n/2)+1; i<diamond.length;i++){
            for(int j=diamond.length-1; j>i;j--){
                diamond[i][j]=" ";
            }
        }



//gora lewa
        for (int i =0; i<(diamond.length/2);i++){
            for(int j=0; j<(n/2)-i;j++){
                diamond[i][j]=" ";
            }
        }
//gora prawo
        for (int i =0; i<(diamond.length/2);i++){
            for(int j=diamond.length-1; j>i+(n/2);j--){
                diamond[i][j]=" ";
            }
        }








        for (int i =0; i<diamond.length;i++){
            for(int j=0; j<diamond[0].length;j++){
                System.out.print(diamond[i][j]);
            }
            System.out.println();
        }




        return "lal";
    }
}
