package few;

public class Reverse {

    public static String reverse(String str) {


        byte[] strAsByteArray = str.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] =
                    strAsByteArray[strAsByteArray.length - i - 1];

        }
        int len = strAsByteArray.length;
        String.valueOf(len);
        String result1= "(N = "+String.valueOf(len)+")";
        System.out.println(new String(result) +" "+result1);
        return new String(result)+" "+result1;
    }
}
