
import org.junit.jupiter.api.Test;

import EntropyStrategies.MarkovEntropy;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;

public class InformationTest {
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
}