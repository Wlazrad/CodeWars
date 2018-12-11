package TakeNumber;
//sprawdza czy ilosc nawiasow sie zgadza
public class CheckingGroups {

    public static boolean groupCheck(String s) {
        int len;
        do {
            len = s.length();
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
            s = s.replace("ss", "");
        } while (len != s.length());
        return s.length() == 0;
    }
}

