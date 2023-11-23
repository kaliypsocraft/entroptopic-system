package MathHelpers.NumberTheory;

public class PseudoPrime {
    public static int determine(int[] bases, int n) {
        for (int a : bases) {
            GCD.remainder = Integer.MAX_VALUE;
            if (GCD.gcd(a, n) == 1 && Math.pow(a, n - 1) %  n == 1) {
                return a;
            } 
        }
        return 0;
    }
}
