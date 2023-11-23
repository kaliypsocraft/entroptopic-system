package MathHelpers.Ciphers;

public class Polyalphabetic {
    private static final int A = 65;
    private static final int Z = 90;
    private static final int a = 97;
    private static final int z = 122;   
    
    public static String encrypt(String key, String plainText) {
        char[] keyWordChar = format(plainText, key);
        plainText = plainText.replaceAll(" ", "");
        char[] plainTextChar = plainText.toCharArray();
        String encrypted = "";
        
        int index = 0;
        while(encrypted.length() < plainTextChar.length) {
            char plainChar = plainTextChar[index];
            char keyChar = keyWordChar[index];
            int difference = keyChar - 'A';
            char encryptedChar = (char) ((((plainChar + difference) - 65) % 26) + 65) ;
            encrypted = (encrypted + encryptedChar);
            index++;
        }
        return encrypted;
    }
    public static String decrypt() {
        return "";
    }
    private static boolean isCapital(char subject) {
        return A <= subject && Z >= subject;
    }
    private static boolean isLowerCase(char subject) {
        return a <= subject && z >= subject;
    }
    private static char[] format(String plainTextString, String key) {    
        // Remove spaces
        plainTextString = plainTextString.replaceAll(" ", "");
        char[] plainText = plainTextString.toCharArray();
        for (char character : plainText) {
            if (key.length() >= plainText.length) {
                break;
            }
            key = key + character;
        }
        return key.toCharArray();
    }
}
