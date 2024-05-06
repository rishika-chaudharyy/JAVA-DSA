// Given a string containing digits from 2-9 inclusive, print all possible letter combinations that the number could represent. You can print the answer in any order. A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

// Sample Input 1:"23"
// Sample Output 1:
// "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf" 

public class KeyPadCombinations {
    final static char L[][] = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
            { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

    public static void bfs(int i, int n, String D, StringBuilder sb) {
        if (i == n) { // base case
            System.out.println(sb.toString());
            return;
        } else {
            char letters[] = L[Character.getNumericValue(D.charAt(i))];
            for (int j = 0; j < letters.length; j++) {
                bfs(i + 1, n, D, new StringBuilder(sb).append(letters[j])); // Fix here: letters[j] instead of
                                                                            // letters[i]
            }
        }
    }

    public static void findCombination(String D) {
        if (D.length() == 0) {
            System.out.println("");
            return;
        }

        bfs(0, D.length(), D, new StringBuilder());
    }

    public static void main(String args[]) {
        findCombination("23");
    }
}
