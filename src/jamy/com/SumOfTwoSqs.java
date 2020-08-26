package jamy.com;

public class SumOfTwoSqs {
    public static String SquaresOfSum(int n) {
        for (int i = 1; i < n / 2; i++) {
            for (int j = 1; j < n / 2; j++) {
                if ((i * i + j * j) == n) {
                    return n + " = " + i + "^2 + " + j + "^2";
                }
            }
        }
        return n + " Cannot be expressed as squares of sum";
    }
}
