package MathHelpers.Ciphers;

import java.math.BigDecimal;
import java.math.BigInteger;
import MathHelpers.NumberTheory.PhiFunction;
import MathHelpers.NumberTheory.getModulusInverse;

public class RSA {
    public static void main(String[] args) {
        //int phiResult = (int)PhiFunction.calculate(551);
        //int privateKey = getModulusInverse.getInverse(55, phiResult);
        //System.out.println(encrypt(10, 55, 551));
        int[] cipherText = {366, 14, 126, 126, 3, 249, 258, 126, 148, 30, 45, 366, 58, 30};
        int[] plainText = new int[cipherText.length];
        int index = 0;
        for (int cipher : cipherText) {
            //System.out.println(decrypt(3, cipher, 391));
            String output = decrypt(3, cipher, 391).toString();
            plainText[index++] = Integer.parseInt(output);
        }
        printText(plainText);
    }
    private static void printText(int[] text) {
        for (int character : text) {
            character = character - 3 + 'A';
            System.out.print((char)character);
        }
        System.out.println();
    }
    // e should be random to maximise security
    public static BigInteger encrypt(int plainText, int e,  int n) {
        // Number of co-prime numbers (n, k) such that k < n
        // This result is used to find the public key

        BigInteger base = new BigInteger(String.valueOf(plainText));
        BigInteger power = new BigInteger(String.valueOf(e));
        BigInteger modulus = new BigInteger(String.valueOf(n));
        return base.modPow(power, modulus);
    }
    public static BigInteger decrypt(int privateKey, int cipherCharacter, int n) {
        BigInteger base = new BigInteger(String.valueOf(cipherCharacter));
        BigInteger power = new BigInteger(String.valueOf(privateKey));
        BigInteger modulus = new BigInteger(String.valueOf(n));
        return base.modPow(power, modulus);
    }
}
