package MathHelpers;

public class LogConversion{
    private static final int BINARY = 2;
    
    public static double logBaseChange(double subject, int base) {
        return (Math.log(subject)/Math.log(base));
    }

}
