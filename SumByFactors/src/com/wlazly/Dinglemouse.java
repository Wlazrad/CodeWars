package com.wlazly;

public class Dinglemouse {

    public static String whatTimeIsIt(final double angle) {
        if (angle==360||angle==0){
            return "12:00";

        }
        double min=0;
        min=angle*2;

        int hours=0;
        int minuts=0;
        double rest=0;
        rest = min/60;
        double rest1=0;

        hours =(int) min/60;

        rest1=min-(hours*60);
        minuts=(int)rest1;
        System.out.println(min);
        System.out.println(hours);
        System.out.println(minuts);

        String times = "";
        String po = "";
        String po1 ="";
        po=po+minuts;
        po1=po1+hours;
        if(minuts<10){
            String zero ="0";
             po = zero+minuts;
        }

        if(hours<10){
            String zero ="0";
            po1 = zero+hours;
        }
        if(angle<30){
            po1="12";
        }
        times=po1+":"+po;
String ends = times.toString();

        return ends;
    }

}
