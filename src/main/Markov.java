import EntropyStrategies.Entropy;
import EntropyStrategies.MarkovEntropy;

public class Markov {
    private double[][] matrix;
    private double[] vector;
    private MarkovEntropy strategy;
    public Markov(double[][] matrix, double[] vector) {
        this.matrix = matrix;
        this.vector = vector;
        this.strategy = new MarkovEntropy(matrix, vector);
    }
    public void doStrategy() {
        strategy.calculateEntropy();
    }

    
}
