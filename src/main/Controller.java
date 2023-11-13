
import EntropyStrategies.MarkovEntropy;
import EntropyStrategies.TypicalEntropy;
import MathHelpers.FermatFactorisation;
import MathHelpers.MillerRabinTest;
import MathHelpers.PhiFunction;
import MathHelpers.PrimeFactors;
import MathHelpers.getOrder;

public class Controller{
    public static void main(String[] args) {
      System.out.println("Welcome to Kaliypso's MATH3411 Package");
      double[] probabilities = {6.0/9.0, 2.0/9.0, 1.0/9.0};
      TypicalEntropy.calculateEntropy(probabilities, 2);
  }
}