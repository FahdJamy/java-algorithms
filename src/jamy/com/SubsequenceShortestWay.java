package jamy.com;

/*
 Leet-code (Google problem)
 find the minimum number of subsequences required to form a target string from a source string
 return -1 if not possible

 e.g
 1. if source = xyz and target = xzyxz, output = 3   because 'xz' 'y' and 'xz' substring.
 2. if source = abc and target = abcbc, output = 2    because abc and bc substrings
*/


public class SubsequenceShortestWay {
    public static int shortestWay(String source, String target) {
        int subsequencesCount = 0;
        String remaining = target;

        while (remaining.length() > 0) {
            // Build the subsequence
            StringBuilder subSeq = new StringBuilder();
            int i = 0; // pointer (char) we are at inside source
            int j = 0; /// pointer (char) we are looking for inside remaining.
            while (i < source.length() && j < remaining.length()) {
                if (source.charAt(i) == remaining.charAt(j)) {
                    subSeq.append(remaining.charAt(j));
                    j++;
                }
                i++;
            }
            if (subSeq.length() == 0) {
                return -1;
            }
            subsequencesCount++;
            remaining = remaining.substring(subSeq.length());
        }
        return subsequencesCount;
    }
}
