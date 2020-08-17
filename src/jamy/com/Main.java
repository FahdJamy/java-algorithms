package jamy.com;

public class Main {
    public static void main(String[] args) {
        IsPrime.isPrime(10);
        int [] housesToRob = {2,4,5,7,1,2,9};
        int housesToBeRobbed = HouseRobber.houseRobber(housesToRob);
        System.out.println(housesToBeRobbed);

        int isBean = IsBean.isBean(new int[]{3,8,4});
        System.out.println(isBean);

        int [] isCenteredArr = {2,4,5,7,1,2,9};
        int isCentered = IsCentered.isCentered(isCenteredArr);
        System.out.println(isCentered);
    }
}
