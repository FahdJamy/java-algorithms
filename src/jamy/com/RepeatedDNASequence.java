// This is a google asked question.
package jamy.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class RepeatedDNASequence {
    public static List<String> findRepeatedDnaSequence (String s) {
        List<String> repeatedSequence = new ArrayList<>();
        Map<String, Integer> foundSubStrs = new HashMap<>();
        int i = 0;
        while (i + 10 <= s.length()) {
            String subsequence = s.substring(i, i++ + 10);
            foundSubStrs.put(subsequence, foundSubStrs.getOrDefault(subsequence, 0)+1);
            if (foundSubStrs.get(subsequence) == 2) {
                repeatedSequence.add(subsequence);
            }
        }

        return repeatedSequence;
    }
}
