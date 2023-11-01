package EntropyStrategies;
import static MathHelpers.LogConversion.logBaseChange;

public class MarkovEntropy extends Entropy{
    private double[][] matrix;
    private double[] vector;
    private int column;
    private int row;
    private double entropy;
    public MarkovEntropy(double[][] matrix, double[] vector) {
        this.matrix = matrix;
        this.vector = vector;
        this.row = matrix.length;
        this.column = matrix[0].length;
    }
    
    @Override
    public double calculateEntropy() {
        double entropy = 0.0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                entropy += - vector[i] * matrix[i][j] * logBaseChange(matrix[i][j], 2);
                //System.out.println("- x1 * x2 * log (x2)" + " x1 = " + vector[i] + " x2 = " + matrix[i][j]);
            }
        }
        this.entropy = entropy;
        return entropy;
    }
    @Override
    public String toString() {
        return "The MarkovEntropy is: " + entropy;
    }
    
}
