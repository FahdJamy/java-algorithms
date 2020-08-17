package jamy.com;

public class IsCentered {
    public static int isCentered (int[] centeredArr) {
        int arrLength = centeredArr.length;
        if (arrLength % 2 == 0) {
            return 0;
        }
        if (centeredArr.length == 1) {
            return 1;
        }
        int midElement = centeredArr[arrLength/2];
        for (int i = 0; i < centeredArr.length; i++) {
            if (i != arrLength/2 && centeredArr[i] < midElement) {
                return 0;
            }
        }
        return 1;
    }
}
