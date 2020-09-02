package jamy.com;

import java.util.Arrays;

// Google question
// the i-th person has the weight people[i] and each weight can carry a maximum weight of (limit).
// Each boat carries at most 2 people at the same time provide their sum is at most the limit
// returning num of boats needed to rescue all the people.
public class BootRescue {
    public static int numRescueBoots(int[] people, int limit) {
        Arrays.sort(people); // sort people array first
        int numBoats = 0;
        int i = 0; // first person (with the least weight)
        int j = people.length - 1; // last person with the heaviest weight
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
            numBoats++;
        }
        return numBoats;
    }
}
