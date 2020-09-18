package jamy.com;

public class PerfectSquare {
    public static int nextPerfectSquare(int n) {
        if (n < 0) return 0;
        int sqrtNum = (int) Math.sqrt(n);
        return (int)Math.pow(sqrtNum + 1, 2);
    }

    public static boolean isPerfectSquare(int n) {
        if (n < 0) return false;
        double sqrtNum = Math.sqrt(n);
        System.out.println(sqrtNum);
        return sqrtNum % 1 == 0;
    }
}
