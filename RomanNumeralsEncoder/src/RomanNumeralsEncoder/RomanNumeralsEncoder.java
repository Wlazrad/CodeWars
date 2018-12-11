package RomanNumeralsEncoder;

public class RomanNumeralsEncoder {


    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int times = 0;
        String[] romans = new String[]{"I", "IV", "V", "IX", "X", "XL", "L",
                "XC", "C", "CD", "D", "CM", "M"};
        int[] ints = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500,
                900, 1000};
        for (int i = ints.length  -1; i >= 0; i--) {
            times = n / ints[i];
            n %= ints[i];
            while (times > 0) {
                sb.append(romans[i]);
                times--;
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}

