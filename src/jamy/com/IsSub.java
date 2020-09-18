package jamy.com;

/*
A Sub Array is defined to be an array in which each element is greater than sum of all
elements after that. see example below:
{13,6,3,2} is a sub array. Note that 13 > 6+3+2, 6 > 3+2, 3>2.
*/

public class IsSub {
    public static int isSub(int[] a) {
        int subSum = a[a.length - 1];
        int iterIndex = a.length - 2;
        while (iterIndex >= 0) {
            if (subSum >= a[iterIndex]) {
                return 0;
            }
            subSum += a[iterIndex];
            iterIndex--;
        }
        return 1;
    }
}
