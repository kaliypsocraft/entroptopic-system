package MathHelpers.Information;

import EntropyStrategies.MarkovEntropy;

public class Markov {

    public static double findEntropy(double[][] matrix, double[] vector) {
        return MarkovEntropy.calculateEntropy(matrix, vector);
    }
}
