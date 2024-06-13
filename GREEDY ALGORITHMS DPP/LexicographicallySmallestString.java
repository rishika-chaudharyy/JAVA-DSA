
// Given two integers N and K, the task is to print the lexicographically smallest string of length N consisting of lowercase English alphabets such that the sum of the characters of the string equals K. Here, 'a' is valued at 1, 'b' at 2, 'c' at 3, ..., and 'z' at 26.
// import java.util.*;

public class LexicographicallySmallestString {
    public static void main(String args[]) {
        int n = 5;
        int k = 85;
        int kk = k - n;

        String s = "";  // Initialize the string
        for (int i = n - 1; i >= 0; i--) {
            if (kk >= 25) {
                s = 'z' + s;  // Prepend 'z' to the string
                kk -= 25;
            } else {
                s = (char) ('a' + kk) + s;  // Prepend the character based on kk
                kk = 0;
            }
        }

        System.out.println(s);
    }
}
