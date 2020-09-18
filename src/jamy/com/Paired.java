package jamy.com;

/*
An array is considered paired if it's odd index values are even and
if its even indexed values are odd
e.g {7, 2, 3, 6, 7}
 */

public class Paired {
    public static int isPaired(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                if (a[i] % 2 == 0) return 0;
            } else {
                if (a[i] % 2 != 0) return 0;
            }
        }
        return 1;
    }
}
