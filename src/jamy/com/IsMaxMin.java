package jamy.com;

public class IsMaxMin {
    public static int isMaxMinEqual(int[] a) {
        if(a.length <= 1) return 0;
        int maxVal = a[0];
        int minVal = a[0];
        for (int n: a) {
            if (maxVal < n) {
                maxVal = n;
            }
            if (minVal > n) {
                minVal = n;
            }
        }
        if(maxVal == minVal) return 0;
        int maxValCount = 0;
        int minValCount = 0;
        for (int val : a) {
            if (val == maxVal) {
                maxValCount++;
            }
            if (val == minVal) {
                minValCount++;
            }
        }
        if(maxValCount > 1 || minValCount > 1) return 0;
        return 1;
    }
}
