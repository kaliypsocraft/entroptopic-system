
import EntropyStrategies.MarkovEntropy;
import EntropyStrategies.TypicalEntropy;
import MathHelpers.FermatFactorisation;
import MathHelpers.GCD;
import MathHelpers.GetAverageLength;
import MathHelpers.MillerRabinTest;
import MathHelpers.PhiFunction;
import MathHelpers.PrimeFactors;
import MathHelpers.PrimitiveElements;
import MathHelpers.PseudoPrime;
import MathHelpers.GCD;
import MathHelpers.getModulusInverse;
import MathHelpers.getOrder;

public class Controller{
    public static void main(String[] args) {
      System.out.println("Welcome to Kaliypso's MATH3411 Package");
      //double[] probabilities = {4.0/9.0, 2.0/9.0, 1.0/9.0, 1.0/9.0, 1.0/9};
      //double[] probabilities = {0.4,0.3, 0.2, 0.1};
      double[] probabilities = {3.0/7, 4.0/7};
      ShannonFanoCode.calcuateLengths(probabilities, 3);
      
      TypicalEntropy.calculateEntropy(probabilities, 2);
      
      double[] vector = {1000000.0/2166667.0,1166667.0/2166667.0};
      double[][] matrix = {
        {0.65, 0.35},
        {0.3, 0.7}
      };
      Markov.findEntropy(matrix, vector);
      System.out.println(getOrder.calculate(9, 13));
      FermatFactorisation.calculate(24871);
      PhiFunction.calculate(1457);
      
     
      
  }
}