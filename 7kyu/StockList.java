package tribonacci;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


    public class StockList {

        // 1st parameter is the stocklist (L in example),
        // 2nd parameter is list of categories (M in example)
        public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
            int sum = 0;
            boolean hasRunOnce = false;
            String stock = "";
            for(int i = 0; i < lstOf1stLetter.length; i++) {
                for(int j = 0; j < lstOfArt.length; j++) {
                    if(lstOf1stLetter[i].charAt(0) == lstOfArt[j].charAt(0)) {
                        sum += Integer.parseInt(lstOfArt[j].substring(lstOfArt[j].indexOf(" ") + 1));
                    }
                    if(j == lstOfArt.length - 1) {
                        if(!hasRunOnce) {
                            stock += "(" + lstOf1stLetter[i] + " : " + sum + ")";
                            sum = 0;
                            hasRunOnce = true;
                        }
                        else {
                            stock += " - (" + lstOf1stLetter[i] + " : " + sum + ")";
                            sum = 0;
                        }
                    }
                }
            }
            return stock;
        }
    }

