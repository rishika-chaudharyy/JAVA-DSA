// TC is O(n)
// Given a string s , just containing the characters {} , () , [] , determine if
// the input string is valid
// valid conditions
// open breackets must be closed by the same type of close brackets
// open brackets must be closed in same order
// Every close bracket has a corresponding open bracket of the same type

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if (((s.peek()) == '(' && ch == ')')
                        || ((s.peek()) == '{' && ch == '}')
                        || ((s.peek()) == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }

        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        String str = "({}()[])))";
        System.out.println(isValid(str));
    }
}