package few;

import java.util.Arrays;

public class HighestScoringWord {

    public static String Highest (String s) {
                String ten = null;
               String[] sortowanie= s.split(" ");
               for (int i = 0; i<sortowanie.length;i++) {
                   char[] wyjenty = sortowanie[i].toCharArray();
                   Arrays.sort(wyjenty);
                   String[] posortowany = new String[sortowanie.length];
                   String.join(", ", Arrays.toString(wyjenty));
                   //String [] wkladanie = new String []
                   posortowany[i] = String.valueOf(wyjenty);
                  // System.out.println(posortowany[i]);
                  // System.out.println(posortowany[sortowanie.length-1]);
                   ten=posortowany[sortowanie.length-1];
               }
        System.out.println(ten);
                        return ten ;
    }

}

