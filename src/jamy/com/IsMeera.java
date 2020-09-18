package jamy.com;

public class IsMeera {
    public static int isArrayMeera(int[] a) {
        if (a.length < 1) return 0;
        if (a.length == 1 && a[0] != 1 && a[0] != 9) return 1;
        int isMeeraVal = 0;
        for (int i : a) {
            if (isMeeraVal == 0) {
                if (i == 1 || i == 9) {
                    isMeeraVal = i;
                }
            }
            if (isMeeraVal != 0 && i == 9) {
                if (isMeeraVal == 1) return 1;
            } else if (isMeeraVal != 0 && i == 1) {
                if (isMeeraVal == 9) return 1;
            }
        }
        if (isMeeraVal == 0) return 1;
        return 0;
    }

    /*
    A number is considered meera if the sum of it's nonTrivial factors is
    one of it's non trivial factors.
    One is not considered as a non trivial factor of a number in this instance.
     */
    public static int isMeera(int n) {
        int nonTrivialFactors = 0;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                nonTrivialFactors++;
            }
        }
        if (n % nonTrivialFactors != 0) return 0;
        return 1;
    }
}
