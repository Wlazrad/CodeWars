package com.wlazly;

import java.lang.StringBuilder;
import java.util.Arrays;

class Solution {
    static String toCamelCase(String s) {
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
                nowa = list[i].replace(list[i].charAt(0), list[i].toUpperCase().charAt(0));
                result += nowa;
                System.out.println(nowa);
                result1 = result;
            }
            if (Character.isLowerCase(list[0].charAt(0))) {
                nowa = list[i].replace(list[i].charAt(0), list[i].toUpperCase().charAt(0));
                result += nowa;
                result1 = result.replace(result.charAt(0), result.toLowerCase().charAt(0));
            }
        }
        return result1;
    }
}
