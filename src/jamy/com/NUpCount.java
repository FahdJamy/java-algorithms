package jamy.com;

/*
Define the n-up-count of an array to be the number of times the partial sum goes from less than
or equal to n to greater than n during the calculation of the sum of elements of the array.
if you are programming in Java or C#, the function signature is int nUpCount(int[] a, int n)
 */

public class NUpCount {
    public static int nUpCount(int[] a, int n) {
        int partialSumCount = 0;
        int sum = 0;
        for (int val : a) {
            sum += val;
            if (sum > n) partialSumCount ++;
        }
        return partialSumCount;
    }
}
