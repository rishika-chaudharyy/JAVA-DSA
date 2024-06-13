
//Given two arrays A and B of equal length n . Pair each element of array A to element in array B such that sums of absolute difference of all the pairs is minimum
//TC is O(nlogN)
import java.util.*;

public class MinimumAbsoluteDifferencePairs {
    public static void main(String args[]) {
        int B[] = { 4, 1, 8, 7 };
        int A[] = { 2, 3, 6, 5 };

        Arrays.sort(A);
        Arrays.sort(B);

        int min = 0;
        for (int i = 0; i < A.length; i++) {
            min += Math.abs(A[i] - B[i]);
        }

        System.out.println("Min difference is " + min);
    }
}
