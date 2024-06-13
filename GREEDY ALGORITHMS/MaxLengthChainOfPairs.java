
//You are given N pair of numbers . In every ;pair th efirst number is slways smaller than the second number . A pair (c,d) can come after pair(a,b) if b<c . Find the longest chain which can be formed from given set or pairs
//TC is O(nlogN)
import java.util.*;

public class MaxLengthChainOfPairs {
    public static void main(String args[]) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        // Sort the pairs by the second element
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));

        // Initialize chain length and last end
        int chainLen = 1;
        int lastEnd = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            // If the current pair can be chained, increment the chain length and update
            // last end
            if (pairs[i][0] > lastEnd) {
                chainLen++;
                lastEnd = pairs[i][1];
            }
        }

        System.out.println("Max length of chain is " + chainLen);
    }
}
