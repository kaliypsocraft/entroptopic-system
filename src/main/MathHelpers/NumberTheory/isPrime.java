package MathHelpers;

/* 
 *  Basic prime number validator for non-large integers --> Courtesy of ChatGPT 3.5
 */
public class isPrime {
    public static boolean validate(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        if (number <= 3) {
            return true; // 2 and 3 are prime
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false; // Divisible by 2 or 3, not prime
        }

        // Starting from 5 and incrementing by 6 to check prime numbers
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false; // Divisible by i or i+2, not prime
            }
        }

        return true; // If not divisible by any numbers, it is prime
    }
}
