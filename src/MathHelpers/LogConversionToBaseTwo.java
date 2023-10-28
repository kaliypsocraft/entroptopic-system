package MathHelpers;

public class LogConversionToBaseTwo {
    private static final int BINARY = 2;
    
    public static double logBaseTwo(double subject) {
        return (Math.log(subject)/Math.log(BINARY));
    }

}
