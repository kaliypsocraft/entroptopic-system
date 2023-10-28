package main.EntropyStrategies;
import static MathHelpers.LogConversionToBaseTwo.logBaseTwo;

public class TypicalEntropy extends Entropy {
    private double[] frequencies;
    
    public TypicalEntropy(double[] frequencies) {
        this.frequencies = frequencies;
    }
    
    @Override
    public double calculateEntropy() {
        double entropy = 0.0;
        for (double frequency : frequencies) {
            entropy += - frequency * logBaseTwo(frequency);
        }
        return entropy;
    }
    
}
