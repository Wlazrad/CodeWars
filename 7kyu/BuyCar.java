package com.wlazly;

public class BuyCar {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {

        int sumper=0;
        int countmonth=0;



        for (int i = 0; sumper<startPriceNew;i++) {

            sumper = (int) ((startPriceOld-(0.015*startPriceOld*i)) + savingperMonth * i);
            
            System.out.println(sumper);
            System.out.println(i);
        }





        return null;


    }


}