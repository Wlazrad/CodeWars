package Thirteen;

public class CaffeineBuzz {
    public static String caffeineBuzz(int n) {
        String result = "";

        if (n % 3 == 0) {
            result = "Java";
        }
        if (n % 3 == 0 && n % 4 == 0) {
            result = "Coffee";
        }
        if (n % 3 == 0 && n % 2 == 0) {
            result = "JavaScript";
        }
        if (n % 3 == 0 && n % 4 == 0 && n % 2 == 0) {
            result = "CoffeeScript";
        }
        if (n == 0) {
            result = "mocha_missing!";
        }
        if (n % 3 != 0 && n % 4 != 0 && n % 2 != 0
                ||n % 3 != 0 && n % 2 != 0
                ||n % 3 != 0 && n % 4 != 0
                ||n % 3 != 0) {
            result = "mocha_missing!";
        }


      // System.out.println(result);
        return result;
    }
}

