// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst {
    public static void main(String[] args) {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the Primes upper bound ===>>");
        final int MAX = input.nextInt();
        boolean primes[] = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[]) {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        //  Step 1: Set all array values to true
        for (int key = 1; key < primes.length; key++) {
            //Set all values to true
            primes[key] = true;
        }
        //Step 2: Removing multiples of primes
        // Hint: Nested loop
        for (int index = 2; index < primes.length; index++) {
            for (int multiples = (2 * index); multiples < primes.length; multiples += index) {
                primes[multiples] = false;
            }

        }
    }

        public static void displayPrimes(boolean primes[])
        {
            System.out.println("\n\nPRIMES BETWEEN 1 AND " + primes.length);
            System.out.println();

            for (int k = 2; k < primes.length; k++) {
                //Check if primes are true
                if (primes[k] == true) {

                    System.out.print(k + " ");
                }
            }
        }
    }




