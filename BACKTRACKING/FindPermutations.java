//Find and print all the permutations of the string

public class FindPermutations {
    public static void findPermutations(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursive function call

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // remving curr char from string
            // abcde removing c = ab+de = abde using substring method
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(newStr, ans + curr);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        findPermutations(str, "");
    }
}
