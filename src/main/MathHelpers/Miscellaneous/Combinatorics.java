package MathHelpers.Miscellaneous;


public class Combinatorics {
    public static int C(int n, int k) {
        int numerator = Factorial.factorial(n);
        int denominatorLHS = Factorial.factorial(k);
        int denominatorRHS = Factorial.factorial(n - k);
        return (int) (numerator / (denominatorLHS) * denominatorRHS);
    }
  
}
