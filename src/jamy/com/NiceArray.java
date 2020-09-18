package jamy.com;

/*
A nice array is defined to be an array where for every value n in the array, there is
also an element n-1 or n+1 in the array and 2n is not in the array
 */

public class NiceArray {
    public static int isNice(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean isNiceVal = false;
            for (int j = 0; j < a.length; j++) {
                if (j == i) continue;
                if (a[j]*2 == a[i]) return 0;
                if (a[j] + 1 == a[i] || a[j] - 1 == a[i]) {
                    isNiceVal = true;
                }
            }
            if (!isNiceVal) return 0;
        }
        return 1;
    }
}
