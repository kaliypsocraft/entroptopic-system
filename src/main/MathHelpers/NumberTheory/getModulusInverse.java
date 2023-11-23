package MathHelpers.NumberTheory;

import java.math.BigInteger;

public class getModulusInverse {
    public static int getInverse(int n, int base) {
        for (int i = 2; i <= base; i++) {
            if (n * i % base == 1) {
                return i;
            }
        }
        return 0;
    }
}
