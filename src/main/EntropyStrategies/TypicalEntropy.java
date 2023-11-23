package EntropyStrategies;
import static MathHelpers.Miscellaneous.LogConversion.logBaseChange;

public class TypicalEntropy {
   
    private static double entropy = 0.0;
    

    public static double calculateEntropy(double[] frequencies, int base) {
        for (double frequency : frequencies) {
            entropy += - frequency * logBaseChange(frequency, base);
        }
        System.out.println(print());
        return entropy;
    }

    public static String print(){
        return "The entropy is: " + entropy;
    }
    
}
