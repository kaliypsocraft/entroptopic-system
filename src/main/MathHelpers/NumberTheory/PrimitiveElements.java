package MathHelpers;

import java.util.HashSet;
import java.util.Set;

public class PrimitiveElements {
    private static Set<Integer> primitives = new HashSet<>();
    public static Set<Integer> givenOnePrimitive(int n, int modulo) {
        for (int i = 1; i < modulo - 1; i++) {
            System.out.println("---------------");
            GCD.remainder = Integer.MAX_VALUE;
            if (GCD.gcd(i, modulo - 1) == 1) {
                System.out.println("Adding: " + n + "^" + i + " is " + Math.pow(n, i) % 26);
                primitives.add((int)Math.pow(n, i) % modulo);
            }
        }
        return primitives;
    }
}
