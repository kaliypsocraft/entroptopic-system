import EntropyStrategies.MarkovEntropy;

public class Controller {
    public static void main(String[] args) {
        double[][] matrix = {
            {0.3, 0.5, 0.2},
            {0.1, 0.1, 0.8},
            {0.1, 0.55, 0.35}
        };
        double[] vector = {1/8.0, 3/8.0, 4.0/8.0};
        MarkovEntropy test = new MarkovEntropy(matrix, vector);
        System.out.println("Result: " + test.calculateEntropy());
    }
}