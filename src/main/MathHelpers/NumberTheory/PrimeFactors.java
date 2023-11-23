package MathHelpers.NumberTheory;

import java.util.HashSet;
import java.util.Set;

/*
 * Courtesy of ChatGPT 3.5 for producing the code
 */
public class PrimeFactors {
    private static Set<Integer> distinctPrimes = new HashSet<>();
    public static Set<Integer> primeFactors(int n) {
        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            distinctPrimes.add(2);
            n /= 2;
        }

        // n must be odd at this point, so a loop to check for the factors
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                distinctPrimes.add(i);
                n /= i;
            }
        }
        
        // If the number is a prime number greater than 2
        if (n > 2) {
            distinctPrimes.add(n);
        }
        return distinctPrimes;
    }
    
}
