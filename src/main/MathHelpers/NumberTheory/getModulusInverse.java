package MathHelpers;

public class getModulusInverse {
    public static String getInverse(int n, int base) {
        for (int i = 2; i <= base; i++) {
            if (n * i % base == 1) {
                return "Inverse is " + i;
            }
        }
        return "No inverse!";
    }
}
