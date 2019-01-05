package Thirteen;

public class Repeater {
    public static String repeat(String string,long n){
        String radek= "";
        for(int i = 0; i<n;i++){

            radek+= string;
        }
        System.out.println(radek);
        return radek;
    }
}

