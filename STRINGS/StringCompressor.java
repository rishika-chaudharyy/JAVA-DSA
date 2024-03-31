//Write a program to compress the given String
//TC is O(n)
public class StringCompressor {
    public static String stringCompress(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1; // object type because we will append this to our string
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "aaaaabccccd";
        System.out.println(stringCompress(str));
    }
}
