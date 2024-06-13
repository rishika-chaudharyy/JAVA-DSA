// Given a balanced string s of size N with an equal number of 'L' and 'R' characters, the task is to find the maximum number X, such that the given string can be partitioned into X balanced substrings. A string is called balanced if the number of 'L's in the string equals the number of 'R's.

public class MaximumBalancedStringPartition {
    public static void main(String args[]) {
        String s = "LRRRRLLRLLRL";
        int n = s.length();
        int l = 0;
        int r = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'L') {
                l++;
            } else {
                r++;
            }
            if (l == r) {
                ans++;
                l = 0;
                r = 0;
            }
        }
        System.out.println(ans);
    }
}