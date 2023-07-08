
Que 2)Write a program to find the prime factors of a given number.
 import java.util.Arrays;

public class PrimeFactors {
    public static void main(String[] args) {
        int number = 84; // Example input
        int[] primeFactors = findPrimeFactors(number);
        System.out.println("Prime Factors of " + number + ": " + Arrays.toString(primeFactors));
    }

    public static int[] findPrimeFactors(int number) {
        int[] primeFactors = new int[number];
        int index = 0;

        // Check for divisible factors starting from 2
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                primeFactors[index++] = i;
                number /= i;
            }
        }

        return Arrays.copyOf(primeFactors, index);
    }
}
