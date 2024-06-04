//Write a program to reverse a tring using stack

import java.util.Stack;

public class ReverseString {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();

        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder sb = new StringBuilder();

        while (!s.isEmpty()) {
            char curr = s.pop();
            sb.append(curr);

        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "abc";
        System.out.println(reverseString(str));
    }
}
