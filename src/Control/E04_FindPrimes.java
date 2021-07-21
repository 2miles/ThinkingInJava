package Control;

public class E04_FindPrimes {
    public static void main (String[] args) {
        boolean isPrime = true;
        int count = 0;
        int wrap = 0;
        for (int n = 2; n <= 1000000; n++)
        {
            for (int i = 2; i < n; i++)
            {
               if (n%i == 0) {
                   isPrime = false;
                   break;
               }
            }
            if(isPrime)
            {
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
