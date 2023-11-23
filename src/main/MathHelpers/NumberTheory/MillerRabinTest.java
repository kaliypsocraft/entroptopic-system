package MathHelpers.NumberTheory;

public class MillerRabinTest {
    private static double s;
    private static double t;
    public static String calculate(double n, double[] bases) {
        s = getPower(n - 1);
        for (double a : bases) {
            if (Math.pow(a, t) % n == 1) {
                return n + " is a strong pseudo-prime at base " + a;
            } else {
                for (int r = 0; r <= s - 1; r++) {
                    if (Math.pow(a, 2 * r * t) % n == (n - 1)) {
                        return n + " is a strong pseudo-prime at base " + a;
                    }
                }
            }
        }
        return "Composite";
    }
    private static double getPower(double n) {
        double temp = n;
        int power = 0;
        while(temp % 2 != 1) {
            temp /= 2;
            power++;
        }
        t = temp;
        return power;
    }
}
