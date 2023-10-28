package main;

public class Entropy {
    private double[] frequencies;
    private static final int BINARY = 2;
    public Entropy(double[] frequencies) {
        this.frequencies = frequencies;
    }
    public double calculateEntropy() {
        double entropy = 0.0;
        for (double frequency : frequencies) {
            entropy += - frequency * logBaseTwo(frequency);
        }
        return entropy;
    }
    public double logBaseTwo(double subject) {
        return (Math.log(subject)/Math.log(BINARY));
    }
}
