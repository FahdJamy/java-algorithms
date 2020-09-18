package jamy.com;

public class CommonElements {
    public static int[] f(int[] first, int[] second) {
        if (first == null || second == null) return null;
        if (first.length == 0 || second.length == 0) return new int[]{};
        int[] commonElementsFound = new int[Math.min(first.length, second.length)];
        int index = 0;
        int count = 0;
        for (int i : first) {
            for (int j : second) {
                if (i == j) {
                    commonElementsFound[index++] = i;
                    count++;
                    break;
                }
            }
        }
        int[] commonElements = new int[count];
        for (int i = 0; i < commonElements.length; i ++) {
            commonElements[i] = commonElementsFound[i];
        }
        return commonElements;
    }
}
