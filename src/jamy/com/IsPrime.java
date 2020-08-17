package jamy.com;


public class IsPrime {
    public static int isPrime(int n) {
        boolean[] primes = new boolean[n];
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }
        for (int i = 2; i * i < primes.length; i++) {
            if(primes[i]) {
                for (int y = i; y * i < primes.length; y++) {
                    primes[i * y] = false;
                }
            }
        }
        int primeCount = 0;
        for (boolean prime : primes) {
            if (prime) {
                primeCount++;
            }
        }
        return primeCount;
    }
}
