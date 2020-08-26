package jamy.com;

public class SumFactor {
    public static int sumFactor(int[] a) {
        if (a.length == 0) return 0;
        int totalSum = 0;
        int sumFactor = 0;
        for (int v : a) totalSum += v;
        for (int i: a) {
            if (totalSum == i) sumFactor++;
        }
        return sumFactor;
    }
}
