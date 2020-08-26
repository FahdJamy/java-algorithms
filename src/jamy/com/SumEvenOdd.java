package jamy.com;

public class SumEvenOdd {
    public static int sumEvenOddMinus (int[] arr) {
        if (arr.length == 0)
            return 0;
        int sumOdd = 0;
        int sumEven = 0;
        for (int val : arr) {
            if (val % 2 == 0) {
                sumEven += val;
            } else {
                sumOdd += val;
            }
        }
        return sumOdd - sumEven;
    }
}
