package jamy.com;

public class HouseRobber {
    public static int houseRobber (int[] houses) {
        if (houses == null || houses.length == 0) {
            return 0;
        }
        if (houses.length == 1) {
            return houses[0];
        }
        if (houses.length == 2) {
            return Math.max(houses[0], houses[1]);
        }
        int [] housesProfit = new int[houses.length];
        housesProfit[0] = houses[0];
        housesProfit[1] = Math.max(houses[0], houses[1]);
        for (int i = 2; i < houses.length; i++) {
            housesProfit[i] = Math.max((houses[i] + housesProfit[i - 2]), housesProfit[i-1]);
        }
        return housesProfit[housesProfit.length - 1];
    }
}
