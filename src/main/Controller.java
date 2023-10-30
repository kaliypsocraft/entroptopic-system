import EntropyStrategies.Entropy;
import EntropyStrategies.MarkovEntropy;
import EntropyStrategies.TypicalEntropy;

public class Controller {
    public static void main(String[] args) {
        double[][] matrix = {
            {0.65, 0.35},
            {0.8, 0.2},
        };
        double[] vector = {16/23.0, 7/23.0};
        MarkovEntropy test = new MarkovEntropy(matrix, vector);
        System.out.printf("Result:  %.3f" ,test.calculateEntropy());

        double[] frequencies = {1/9.0, 4/9.0, 3/9.0, 1/9.0};
        Entropy entropy = new TypicalEntropy(frequencies);
        ShannonFanoCode sFCode = new ShannonFanoCode(frequencies);
        System.out.printf("The entropy: %.3f", entropy.calculateEntropy());
        System.out.println(sFCode.calcuateLengths());
        System.out.println(sFCode.getAverageLength());
    }
}