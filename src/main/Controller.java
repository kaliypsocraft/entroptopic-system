import EntropyStrategies.Entropy;
import EntropyStrategies.MarkovEntropy;
import EntropyStrategies.TypicalEntropy;

public class Controller{
    public static void main(String[] args) {
        double[] probabilities = {0.4, 0.3, 0.2, 0.1};
        Entropy entropy = new TypicalEntropy(probabilities, 10);
        entropy.calculateEntropy();
        System.out.println(entropy.toString());

        double[][] matrix = {
            {0.65, 0.35},
            {0.9, 0.1},
        };
        double[] vector = {1000000/1388889.0, (1388889.0 - 1000000)/1388889.0};
        MarkovEntropy test = new MarkovEntropy(matrix, vector);
        double result = test.calculateEntropy();
        System.out.println("Result: " + result);
    }
}