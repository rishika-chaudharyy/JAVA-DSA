//Check if the string is palindrome 
//TC is O(n)

public class PalindromiceString {
    public static boolean checkPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String arhs[]) {
        String str = "noon";
        System.out.println(checkPalindrome(str));
    }
}
