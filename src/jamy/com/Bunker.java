package jamy.com;

/*
A bunker array is an array that contains the value 1 if and only if it contains a prime number.
e.g {7, 6, 10, 1} is considered a bunker array because it contains a prime number 7 and a 1.
 */

public class Bunker {
    public static int isBunkerArr(int[] a) {
        boolean containsAOne = false;
        boolean containsAPrime = false;
        for (int i : a) {
            if (i == 1) {
                containsAOne = true;
                continue;
            }
            if (i > 0 && isPrime(i)) containsAPrime = true;
        }
        if (containsAOne && containsAPrime) return 1;
        return 0;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
