package Kata;

public class getMiddle {
    public static String getMiddle(String word) {

        String words="";
        if (word.length()%2==0)
            words= word.substring(word.length()/2-1,(word.length()/2)+1);
        if (word.length()%2!=0)
            words=word.substring(word.length()/2,(word.length()/2)+1);

        return words;
    }
}