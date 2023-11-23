package MathHelpers.NumberTheory;

public class FermatFactorisation {
    private static double input;
    private static double factored;
    private static double tempSquareRoot;
    private static final int SQUARED = 2;
    
    public static void calculate(double factored) {
        // t = Math.floor(sqrt(factored))
        FermatFactorisation.factored = factored;
        input = Math.floor(Math.sqrt(factored));
        while (!isPerfectSquare(Math.pow(input, SQUARED) - factored)) {
            input++;
        }
        getParameters();
    }
    
    private static void getParameters() {
        double a = input + tempSquareRoot;
        double b = input - tempSquareRoot;
        System.out.println(factored + "<<<<");
        System.out.println(a + " x " + b +  " = " + factored);
    }
    private static boolean isPerfectSquare(double input) {
        double squareRoot = Math.sqrt(input);
        if (squareRoot == Math.floor(squareRoot)) {
            tempSquareRoot = squareRoot;
            return true;
        }
        return false;
    }
}
