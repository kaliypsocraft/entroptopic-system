package MathHelpers;

import java.util.ArrayList;

public class GCD {
    private static int remainder = Integer.MAX_VALUE; 
    private static ArrayList<Integer> coPrimes = new ArrayList<>();
    public static int gcd(int a, int b) {
        System.out.println("a: " + a + " b: " + b);
        if (b == 1) {
           System.out.println("Relatively Prime!");
        }
        if (remainder == 0) {
            return 0;
        }
        remainder = a % b;
        return gcd(b, remainder);
    }   
}
