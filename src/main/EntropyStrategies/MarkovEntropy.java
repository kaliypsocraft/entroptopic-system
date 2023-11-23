package EntropyStrategies;
import static MathHelpers.Miscellaneous.LogConversion.logBaseChange;

public class MarkovEntropy{
        private static double entropy;
        public static double calculateEntropy(double[][] matrix, double[] vector) {
        int row = matrix[0].length;
        int column = matrix.length;
        entropy = 0.0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                entropy += - vector[i] * matrix[i][j] * logBaseChange(matrix[i][j], 2);
                //System.out.println("- x1 * x2 * log (x2)" + " x1 = " + vector[i] + " x2 = " + matrix[i][j]);
            }
        }
        System.out.println(print());
        return entropy;
    }

    public static String print() {
        return "The MarkovEntropy is: " + entropy;
    }
    
}
