
// You're given an encoded string, and your task is to decode it. The encoding pattern follows the format: [count[string]], where count is the number of times the string should be repeated.
import java.util.*;

public class DecodeString {
    public static String decode(String str) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(0);
        Stack<StringBuilder> s2 = new Stack<>();
        s2.push(new StringBuilder(""));

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                s1.push(s1.pop() * 10 + (ch - '0'));
            } else if (Character.isAlphabetic(ch)) {
                s2.peek().append(ch);
            } else if (ch == '[') {
                s1.push(0);
                s2.push(new StringBuilder());
            } else if (ch == ']') {
                StringBuilder temp = s2.pop();
                int count = s1.pop();
                StringBuilder repeatStr = new StringBuilder();
                for (int j = 0; j < count; j++) {
                    repeatStr.append(temp);
                }
                s2.peek().append(repeatStr);
            }
        }
        return s2.peek().toString();
    }

    public static void main(String args[]) {
        String str = "2[cv]";
        System.out.println(decode(str)); // Output: cvcv
    }
}
