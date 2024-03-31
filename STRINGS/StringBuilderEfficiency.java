//Write a program to print sll the characters using stringBuilder
//TC is O(n) where n is 26 

public class StringBuilderEfficiency {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
