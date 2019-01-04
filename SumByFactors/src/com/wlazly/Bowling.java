package com.wlazly;

public class Bowling
{
    public static String bowlingPins(int[] arr) {
        String[][] tab = new String[4][7];
        for (int i = 0; i <tab.length; i++) {
            for (int j = 0; j <tab[i].length; j++) {
                tab[i][j] = "I";
            }
        }
        for (int i = 1; i <tab.length; i++) {
            for (int j = 0; j <i; j++) {
                tab[i][j] = " ";
            }
        }
        int lal= 6;
        for (int i = 1; i <tab.length; i++) {
            lal--;
            for (int j = 6; j>lal; j--) {
                tab[i][j] = " ";
            }
        }
        for (int i = 1; i <tab.length; i++) {
            for (int j = 0; j >i; j=j+2) {
                tab[i][j] = " ";
            }
        }
        tab[0][1]=" ";
        tab[0][3]=" ";
        tab[0][5]=" ";
        tab[1][2]=" ";
        tab[1][4]=" ";
        tab[2][3]=" ";

        for (int i = 0 ; i<arr.length; i++){
            switch (arr[i]){
                case 1:
                    tab[3][3]=" ";
                    break;
                case 2:
                    tab[2][2]=" ";
                    break;
                case 3:
                    tab[2][4]=" ";
                    break;
                case 4:
                    tab[1][1]=" ";
                    break;
                case 5:
                    tab[1][3]=" ";
                    break;
                case 6:
                    tab[1][5]=" ";
                    break;
                case 7:
                    tab[0][0]=" ";
                    break;
                case 8:
                    tab[0][2]=" ";
                    break;
                case 9:
                    tab[0][4]=" ";
                    break;
                case 10:
                    tab[0][6]=" ";
                    break;

            }
        }
String output="";
        for (int i=0; i<tab.length; i++){
            for (int j=0; j<tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }

        for (int i=0; i<tab.length; i++){
            if (i>0)
            output=output+"\n";
            for (int j=0; j<tab[i].length; j++) {
                output=output+tab[i][j];

            }
        }

        System.out.println(output);


        return output;
    }

}
