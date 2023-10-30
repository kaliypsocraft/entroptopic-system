package EntropyStrategies;
import static MathHelpers.LogConversion.logBaseChange;

public class TypicalEntropy extends Entropy {
    private double[] frequencies;
    private int base;
    
    public TypicalEntropy(double[] frequencies, int base) {
        this.frequencies = frequencies;
        this.base = base;
    }
    
    @Override
    public double calculateEntropy() {
        double entropy = 0.0;
        for (double frequency : frequencies) {
            entropy += - frequency * logBaseChange(frequency, base);
        }
        return entropy;
    }
    
}
