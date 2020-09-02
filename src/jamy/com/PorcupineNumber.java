package jamy.com;

public class PorcupineNumber {
    public static int findPorcupineNumber(int n) {
        if (n < 139) {
            return 139;
        }
        int nextPorcupineNum = n;
        if (nextPorcupineNum % 10 != 9) {
            int lastDigit = nextPorcupineNum % 10;
            lastDigit = 9 - lastDigit;
            nextPorcupineNum += lastDigit;
        } else {
            nextPorcupineNum += 10;
        }
        if (new PorcupineNumber().isPrime(nextPorcupineNum))
            return nextPorcupineNum;
        while (!new PorcupineNumber().isPrime(nextPorcupineNum)) {
            nextPorcupineNum += 10;
        }
        return nextPorcupineNum;
    }

    public boolean isPrime(int n) {
        for (int i = 2; i * i < n; i++) {
            if(i % n == 0) {
                return false;
            }
        }
        return true;
    }
}
