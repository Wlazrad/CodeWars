package Factorial;
/*
In mathematics, the factorial of a non-negative integer n,
denoted by n!, is the product of all positive integers less
than or equal to n. For example: 5! = 5 * 4 * 3 * 2 * 1 = 120.
By convention the value of 0! is 1.
 */

public class Factorial {

    public static int factorial (int n){
        int score = 1;
        for (int i =1 ; i<=n; i++){
           score*=i;
        }
        System.out.println(score);
        return score;
    }
}
