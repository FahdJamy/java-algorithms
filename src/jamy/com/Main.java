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

        System.out.println("/////// sum even odd /////////");
        int []sumEveOddArr = {1,2,3,4,4};
        int sumEveOdd = SumEvenOdd.sumEvenOddMinus(sumEveOddArr);
        System.out.println(sumEveOdd);

        System.out.println("/////// sum factor /////////");
        int []sumFactorArr = {1,2,3,4,4};
        int sumFac = SumFactor.sumFactor(sumFactorArr);
        System.out.println(sumFac);

        System.out.println("/////// Is Meera /////////");
        int []isMeeraArr = {1,1,0,8,0,9,9,1};
        int isMeera = IsMeera.isArrayMeera(isMeeraArr);
        System.out.println(isMeera);

        System.out.println("/////// Square sum of a number /////////");
        String SquareSumOfTwo = SumOfTwoSqs.SquaresOfSum(4);
        System.out.println(SquareSumOfTwo);

        System.out.println("//////// IsInertial //////////");
        int []isInertialArr = {-2,-4,-6,-8,-11};
        int isInertial = IsInertial.arrayIsInertial(isInertialArr);
        System.out.println(isInertial);
    }
}
