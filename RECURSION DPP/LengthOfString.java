//Write a program to find the length of the String using Recursion

public class LengthOfString {

    public static int findLength(String str) {
        // Base case: if the string is empty, return 0
        if (str.isEmpty()) {
            return 0;
        }
        // Recursive case: return 1 (for the current character) plus the length of the
        // string excluding the first character
        else {
            return 1 + findLength(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "Hello, world!";
        System.out.println("Length of the string: " + findLength(str));
    }
}
