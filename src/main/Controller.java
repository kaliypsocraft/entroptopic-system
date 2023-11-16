
import EntropyStrategies.MarkovEntropy;
import EntropyStrategies.TypicalEntropy;
import MathHelpers.FermatFactorisation;
import MathHelpers.GCD;
import MathHelpers.MillerRabinTest;
import MathHelpers.PhiFunction;
import MathHelpers.PrimeFactors;
import MathHelpers.GCD;
import MathHelpers.getModulusInverse;
import MathHelpers.getOrder;

public class Controller{
    public static void main(String[] args) {
      System.out.println("Welcome to Kaliypso's MATH3411 Package");
      double[] probabilities = {4.0/9.0, 2.0/9.0, 2.0/9.0, 1.0/9.0};
      ShannonFanoCode.calcuateLengths(probabilities);
      TypicalEntropy.calculateEntropy(probabilities, 2);

      double[][] matrix = {
        {0.25, 0.75},
        {0.45, 0.55}
      };
      double[] vector = {1000000/2666667.0, 1666667.0/ 2666667};
      GCD.gcd(462, 1071);
  }
}