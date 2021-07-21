package Control;

//: Objects/E04_FindPrimes.java
/*********************** Exercise 4 ******************************
 * Use two nested for loops to and the % operator to print a list
 * of the first 1,000,000 prime numbers
 ****************************************************************/
public class E04_FindPrimes {

    public static void main (String[] args) {
        boolean isPrime = true;
        int count = 0;
        int wrap = 0;

        for (int n = 2; n <= 1000000; n++) {
            for (int i = 2; i < n; i++) {
               if (n%i == 0) {
                   isPrime = false;
                   break;
               }
            }
            if(isPrime) {
                ++count; ++wrap;
                System.out.print(n + " ");
                if((wrap + 10) % 10 == 0) {
                    System.out.println();
                }
            }
            isPrime = true;
        }
        System.out.println("\n\n Primes between 0 and 1,000,000: " + count);
    }
}
