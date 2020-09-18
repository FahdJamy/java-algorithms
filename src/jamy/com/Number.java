package jamy.com;

/*
Reverse an integer using numeric operators and without
using any arrays or other data structures.
 */

public class Number {
    public static int reverseNumber(int n) {
        int copiedNumber = n;
        copiedNumber = (copiedNumber < 0 ? -copiedNumber : copiedNumber);
        int reversedNumber = 0;
        while (copiedNumber != 0) {
            int number = copiedNumber % 10;
            if (reversedNumber == 0) {
                reversedNumber = number;
            } else {
                reversedNumber = reversedNumber * 10;
                reversedNumber += number;
            }
            copiedNumber /= 10;
        }
        return (n < 0 ? -reversedNumber : reversedNumber);
    }
}
