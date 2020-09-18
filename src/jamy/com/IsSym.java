package jamy.com;

/*
An isSym (even/odd Symmetric) array is defined to be an array in which even numbers
and odd numbers appear in the same order from "both directions".
You can assume array has at least one element.
{2,7,9,10,11,5,8} is a isSym array.
Note that from left to right or right to left we have even,odd,odd,even,odd,odd,even.
 */

public class IsSym {
    public static int isSym(int[] a) {
        int j = a.length - 1;
        for (int val: a) {
            if (val % 2 == 0) {
                if (a[j--] % 2 != 0) return 0;
            } else {
                if (a[j--] % 2 != 1) return 0;
            }
        }
        return 1;
    }
}
