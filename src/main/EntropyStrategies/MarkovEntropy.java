package EntropyStrategies;
import static MathHelpers.LogConversionToBaseTwo.logBaseTwo;

public class MarkovEntropy extends Entropy{
    private double[][] matrix;
    private double[] vector;
    private int column;
    private int row;
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
                entropy += - vector[i] * matrix[i][j] * logBaseTwo(matrix[i][j]);
            }
        }
        return entropy;
    }
    
}
