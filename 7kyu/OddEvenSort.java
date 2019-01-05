package few;

public class OddEvenSort {
    public static String sortMyString(String s) {
        String odd="";
        String even="";
        char[] result = new char[s.length()];
        for (int i =0; i<s.length();i++){
            if (i%2==0) {
                even += s.charAt(i);

                odd +=result[i];

            }
        }
        System.out.println(even+" "+odd);
        return even+" "+odd;

    }
}