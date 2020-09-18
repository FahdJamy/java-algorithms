package jamy.com;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IsPrime.isPrime(10);
        int[] housesToRob = {2, 4, 5, 7, 1, 2, 9};
        int housesToBeRobbed = HouseRobber.houseRobber(housesToRob);
        System.out.println(housesToBeRobbed);

        int isBean = IsBean.isBean(new int[]{3, 8, 4});
        System.out.println(isBean);

        int[] isCenteredArr = {2, 4, 5, 7, 1, 2, 9};
        int isCentered = IsCentered.isCentered(isCenteredArr);
        System.out.println(isCentered);

        System.out.println("/////// sum even odd /////////");
        int[] sumEveOddArr = {1, 2, 3, 4, 4};
        int sumEveOdd = SumEvenOdd.sumEvenOddMinus(sumEveOddArr);
        System.out.println(sumEveOdd);

        System.out.println("/////// sum factor /////////");
        int[] sumFactorArr = {1, 2, 3, 4, 4};
        int sumFac = SumFactor.sumFactor(sumFactorArr);
        System.out.println(sumFac);

        System.out.println("/////// Is Meera /////////");
        int[] isMeeraArr = {1, 1, 0, 8, 0, 9, 9, 1};
        int isMeera = IsMeera.isArrayMeera(isMeeraArr);
        System.out.println(isMeera);

        System.out.println("/////// Square sum of a number /////////");
        String SquareSumOfTwo = SumOfTwoSqs.SquaresOfSum(4);
        System.out.println(SquareSumOfTwo);

        System.out.println("//////// IsInertial //////////");
        int[] isInertialArr = {-2, -4, -6, -8, -11};
        int isInertial = IsInertial.arrayIsInertial(isInertialArr);
        System.out.println(isInertial);

        System.out.println("/////// Rescue Boats //////////");
        int[] peopleOnBoat = {1, 2, 4, 5, 2, 3};
        int rescueBoatsNeeded = BootRescue.numRescueBoots(peopleOnBoat, 5);
        System.out.println(rescueBoatsNeeded);

        System.out.println("//////// Porcupine Number ////////");
        int porcupineNum = PorcupineNumber.findPorcupineNumber(149);
        System.out.println(porcupineNum);

        System.out.println("//////// Repeated DNA subsequence ////////");
        List<String> subsequence = RepeatedDNASequence.findRepeatedDnaSequence("CCCCCDDDDDCCCCCDDDDDTTTDDDHHHII");
        System.out.println(subsequence);

        System.out.println("//////// Subsequence Shortest Way ////////");
        int subsequences = SubsequenceShortestWay.shortestWay("xyz", "xzyxz");
        System.out.println(subsequences);

        System.out.println("//////// n-up-count of an array ////////");
        int[] nCountArr = {2, 3, 1, -6, 8, -3, -1, 2};
        int nCount = NUpCount.nUpCount(nCountArr, 5);
        System.out.println(nCount);

        System.out.println("//////// Next perfect square ////////");
        System.out.println(PerfectSquare.nextPerfectSquare(36));
        System.out.println(PerfectSquare.isPerfectSquare(7));

        System.out.println("//////// Next perfect square ////////");
        int[] isSymArr = {2, 7, 9, 10, 11, 5, 8};
        int isSym = IsSym.isSym(isSymArr);
        System.out.println(isSym);

        System.out.println("//////// Sub Array ////////");
        int[] subArr = {13, 6, 3, 2};
        int isSub = IsSub.isSub(subArr);
        System.out.println(isSub);

        System.out.println("//////// Is Nice Array ////////");
        int[] isNice = {7, 8, 20, 21, 22, 67, 68};
        int isNiceArr = NiceArray.isNice(isNice);
        System.out.println(isNiceArr);

        System.out.println("//////// Is Max Min Equal ////////");
        int[] isMaxMinArr = {1, 1, 2, 3, 2, 0};
        int isMaxMinEq = IsMaxMin.isMaxMinEqual(isMaxMinArr);
        System.out.println(isMaxMinEq);
    }
}
