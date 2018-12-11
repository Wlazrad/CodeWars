package Kata;

public class BitCounting {

    public static int countBits(int n) {
        int ilosc = 0;
        for (int i = 0; i < Integer.toBinaryString(n).toCharArray().length; i++) {
            if (Integer.toBinaryString(n).charAt(i) == '1')
                ilosc++;


        }
        System.out.println(ilosc);
        return ilosc;
    }
}