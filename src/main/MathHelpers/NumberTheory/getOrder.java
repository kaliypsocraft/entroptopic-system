package MathHelpers;

public class getOrder {
    private static final int CO_PRIME = 1;
    public static double calculate(double order, int modulus) {
        double index = 1;
        while (Math.pow(order, index) % modulus != CO_PRIME) {
            index++;
        }
        return index;
    }
}
