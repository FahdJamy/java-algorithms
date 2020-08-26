package jamy.com;

public class IsMeera {
    public static int isArrayMeera(int[] a) {
        if (a.length < 1) return 0;
        if (a.length == 1 && a[0] != 1 && a[0] != 9) return 1;
        int isMeeraVal = 0;
        for (int i: a){
            if (isMeeraVal == 0) {
                if (i == 1 || i == 9) {
                    isMeeraVal = i;
                }
            }
            if (isMeeraVal != 0 && i == 9) {
                if (isMeeraVal == 1) return 1;
            } else if (isMeeraVal != 0 && i == 1) {
                if (isMeeraVal == 9) return 1;
            }
        }
        if (isMeeraVal == 0) return 1;
        return 0;
    }
}
