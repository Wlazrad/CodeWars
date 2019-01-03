package com.wlazly;

import java.lang.StringBuilder;
import java.util.Arrays;

class ErrorSolution {
    static String toCamelCase(String s) {
        if(s.isEmpty())
            return " ";
        if (s.contains("_")) {
            s = s.replace("_", "-");
        }
        String[] list = s.split("-");
        String nowa = "";
        String result = "";
        String result1 = "";
        System.out.println(Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            if (Character.isUpperCase(list[0].charAt(0))) {
                nowa = list[i].replaceFirst(String.valueOf(list[i].charAt(0)), String.valueOf(list[i].toUpperCase().charAt(0)));
                result += nowa;

                result1 = result;
                System.out.println(result1);
            }
            else  {
                nowa = list[i].replaceFirst(String.valueOf(list[i].charAt(0)), String.valueOf(list[i].toUpperCase().charAt(0)));
                result += nowa;
                result = result.replace(result.charAt(0), result.toLowerCase().charAt(0));
                result1=result.replace(result.charAt(0), result.toLowerCase().charAt(0));
                System.out.println(result1);
            }
        }
        return result1;
    }
}
