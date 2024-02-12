package Chapter5;

public class PrimeNumber {
    public static void main(String[] args) {

        final int NUMBER_OF_PRIMES = 50; // Set the number of prime numbers to be printed
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int number = 2; // A number to be tested for primeness. Start with 2 because 1 is already a prime.
        int count = 0; // Count the number of prime numbers

        System.out.println("The first 50 prime numbers are \n");

        // Repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES) {
            // Assume the number is prime
            boolean isPrime = true;

            // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, number is not a prime
                    isPrime = false;
                    break;
                }
            }
            // Display the prime number and increase the count
            if (isPrime) {
                count++; // Increase the count
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Display the number and advance to the new line
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
            // Check if the next number is prime
            number++;
        }
    }
}
