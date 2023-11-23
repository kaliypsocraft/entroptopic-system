package MathHelpers.NumberTheory;


public class GCD {
    protected static int remainder = Integer.MAX_VALUE;
    public static int gcd(int a, int b) {
        System.out.println("a: " + a + " b: " + b);
        if (remainder == 0) {
            return 0;
        }
        if (b == 1) {
           return 1;
        }
        if (a / b > b) {
            b = a / b;
        }
        remainder = a % b;

        return gcd(b, remainder);
    }   
}
