
//TC is O(n)
//Given a balanced expression , find id it contains duplicate parentheses or not. A set or parentheses are duplicate if the same sub expression is surrounded by multiple parentheses
import java.util.Stack;

public class DuplicateParentheses {
    public static boolean isDuplicateParentheses(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            if (ch == ')') {
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String str = "(a-b)";
        String str2 = "(((a+b)+(c+d)))";
        System.out.println(isDuplicateParentheses(str2));
        System.out.println(isDuplicateParentheses(str));
    }
}
