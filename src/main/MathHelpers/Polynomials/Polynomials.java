package MathHelpers.Polynomials;

import java.lang.reflect.Array;

public class Polynomials {
    public static void main(String[] args) {
        int[] test = {0, 0, 1, 1, 0};
        int[] multiplier = {0, 1, 0, 0, 0};
        // represents x^2 + x
        ensureModulus(test, 2);
        Polynomials.print(multiply(test, multiplier));
    }
    // Check desired index is degree - 1
    public static int[] multiply(int[] A, int[] B) {

        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (B[j] != 0) {
                    int desiredIndex = (i + j) % A.length;
                    if (desiredIndex == A.length - 1) {
                        addition(result);
                        return result;
                    } else {
                        result[desiredIndex] = A[i] * B[j];
                    }
                }
            }
        }
        return result;
    }
    public static void addition(int[] result) {
        int[] additive = {1, 1, 0, 0, 0};
        for (int i = 0; i < result.length; i++) {
            result[i] += additive[i];
        }
    }
    public static void print(int[] subject) {
        for (int i = 0; i < subject.length; i++) {
            // i is the exponent
            // subject[i] is the coefficient
            if (subject[i] > 1 || i == 0) {
                System.out.print(subject[i]);
            }
            if (i != 0) {   
            System.out.print("x");
            }
            if (i != 1 && i != 0) {
                System.out.print("^" + i);
            }
            if (i + 1 != subject.length) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }
    public static void printAsBits(int[] subject) {
        for(int i = 0; i < subject.length; i++) {
            System.out.print(subject[i]);
        }
        System.out.println();
    }
    private static void ensureModulus(int[] subject, int modulus) {
        for (int i = 0; i < subject.length; i++) {
            subject[i] = subject[i] % modulus;
        }
    }
}
