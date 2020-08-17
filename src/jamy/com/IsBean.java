package jamy.com;

// A Bean array is defined to be an integer array where for every value n in the array,
// there is also an element 2n, 2n+1 or n/2 in the array.
public class IsBean {
    public static int isBean (int[] beanArr) {
        int isBean = 0;
        for (int k : beanArr) {
            for (int i : beanArr) {
                if (2 * i == k || 2 * i + 1 == k || i / 2 == k) {
                    System.out.println(i);
                    isBean = 1;
                    break;
                }
            }
            return isBean;
        }
        return isBean;
    }
}
