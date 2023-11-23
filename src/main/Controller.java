
import EntropyStrategies.MarkovEntropy;
import EntropyStrategies.TypicalEntropy;
import MathHelpers.Ciphers.GetFrequencies;
import MathHelpers.Ciphers.Polyalphabetic;
import MathHelpers.Codes.ShannonFanoCode;
import MathHelpers.Information.Markov;
import MathHelpers.Miscellaneous.Combinatorics;
import MathHelpers.Miscellaneous.GetAverageLength;
import MathHelpers.NumberTheory.FermatFactorisation;
import MathHelpers.NumberTheory.GCD;
import MathHelpers.NumberTheory.MillerRabinTest;
import MathHelpers.NumberTheory.PhiFunction;
import MathHelpers.NumberTheory.PrimeFactors;
import MathHelpers.NumberTheory.PrimitiveElements;
import MathHelpers.NumberTheory.PseudoPrime;
import MathHelpers.NumberTheory.getModulusInverse;
import MathHelpers.NumberTheory.getOrder;
import MathHelpers.StringUtils.StringHelper;

public class Controller{
    public static void main(String[] args) {
      System.out.println("Welcome to Kaliypso's MATH3411 Package");
      System.out.println(getModulusInverse.getInverse(235, 352));
      PhiFunction.calculate(391);
      String encrypted = Polyalphabetic.encrypt("FISH", "HELLOADRIAN");
      System.out.println(encrypted);
      System.out.println(Polyalphabetic.encrypt("FISH", encrypted));

      System.out.println(Combinatorics.C(3, 2));

      String cipher = "NZYN CYYF YJYU CHBW LMMW MSMW LAYK IXWS YKUJ WAJZYJMT UKYV IFNZ YDYL NWLK IXUC YQQG LVZG LFYS LDSLBJYW BMHV LWXQ YSLK NZYN CYYF YJYU CHBW LOUK WGHKCVYJ YVOF VJYS ESVD";
    
  }
}