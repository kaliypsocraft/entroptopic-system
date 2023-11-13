package MathHelpers;

import java.util.Set;

public class PhiFunction {
    public static double calculate(int n) {
        // If Phi(isPrime()) = all numbers less than the subject
        if(isPrime.validate(n)) {
            return n - 1;
        } else {    
            Set<Integer> primes = PrimeFactors.primeFactors(n);
            double result = 1.0;
            for (Integer p : primes) {
                result *= (1.0 - (1.0 / p));
            }
            System.out.println("The number of co-prime integers of " + n + " is " + result * n);
           return result * n;
        }
    }
}
