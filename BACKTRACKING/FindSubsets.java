//Write a program to find the subsets of the given string
//TC is O(n*2^n) as total subsets of n is 2^n
//SC is O(n)

public class FindSubsets {
    public static void findSubsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // recursive function
        // character takes yes choice to add into subset
        findSubsets(str, ans + str.charAt(i), i + 1);

        // character takes no choice to add into subset
        findSubsets(str, ans, i + 1);

    }

    public static void main(String args[]) {
        String str = "abc";
        findSubsets(str, "", 0);

    }
}
