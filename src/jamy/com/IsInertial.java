package jamy.com;

public class IsInertial {
    public static int arrayIsInertial(int[] n) {
        if (n.length <= 1) return 0;
        int isMaxVal = 0;
        int oddNumCounts = 0;
        for (int i : n) {
            if (i % 2 == 0 && i > isMaxVal) {
                isMaxVal = i;
            } else if (i % 2 != 0) {
                oddNumCounts++;
            }
        }
        int[] oldVal = new int[oddNumCounts];
        int odds = oddNumCounts;
        for (int i : n) {
            if (i % 2 != 0) {
                if (i > isMaxVal) return 0;
                odds = odds - 1;
                oldVal[odds] = i;
            }
        }
        if (oddNumCounts == 0) return 0;
        for (int i : n) {
            if (i % 2 == 0 && i != isMaxVal) {
                for (int odd : oldVal) {
                    if (i > odd) return 0;
                }
            }
        }
        return 1;
    }
}
