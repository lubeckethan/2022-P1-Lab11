// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        //  Step 1: Set all array values to true
        for(int key= 2; key< primes.length; key++){
            //Set all values to true
        primes[key]= true;
        }
        //Step 2: Removing multiples of primes
        // Hint: Nested loop
        for( int value =2; value< primes.length; value++){
            for(int multiple = value * 2; multiple< primes.length;  )
        }
    }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();

        for(int k= 2; k< primes.length; k++) {
            //Check if primes are true
            System.out.print(k + " ");
        }
    }

}



