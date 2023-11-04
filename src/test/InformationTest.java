
import org.junit.jupiter.api.Test;

import EntropyStrategies.Entropy;
import EntropyStrategies.MarkovEntropy;
import EntropyStrategies.TypicalEntropy;
import MathHelpers.FermatFactorisation;
import MathHelpers.PhiFunction;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class InformationTest {
    @Test
    public void EntropyTests() {
        double[] frequencies1 = {0.4, 0.3, 0.2,0.1};
        Entropy entropy = new TypicalEntropy(frequencies1, 10);
        assertTrue(entropy.calculateEntropy() >= 0.55 && entropy.calculateEntropy() <= 0.6);

        double[] frequencies2 = {27/40.0, 9/40.0, 3/40.0, 1/40.0};
        entropy = new TypicalEntropy(frequencies2, 2);
        assertTrue(entropy.calculateEntropy() >= 1.275 && entropy.calculateEntropy() <= 1.3);
        
    }
    @Test
    public void ShannonCodeTests() {



    }
    @Test
    public void MarkovTests() {
        double[][] matrix = {
            {0.3, 0.5, 0.2},
            {0.1, 0.1, 0.8},
            {0.1, 0.55, 0.35}
        };
        double[] vector = {1/8.0, 3/8.0, 4.0/8.0};
        MarkovEntropy test = new MarkovEntropy(matrix, vector);
        double result = test.calculateEntropy();
        assertTrue(result  <= 1.2 && result >= 1.15);
    }
    @Test
    public void FermatFactorisationTests() {
        FermatFactorisation.calculate(9869.0);   
        FermatFactorisation.calculate(35581);
    }
     public void PhiFunctionTests() {
        assertTrue(PhiFunction.calculate(72) == 24);
        assertTrue(PhiFunction.calculate(289) == 16);


    }
}