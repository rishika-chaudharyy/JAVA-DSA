//Write a program to find the substring of the given string using the inbuilt function and by creating the same function
public class Substring {
    // creating the function
    public static String findSubstring(String str, int si, int ei) {
        String result = "";
        for (int i = si; i < ei; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String args[]) {
        String str = "Hello World";
        System.out.println(findSubstring(str, 0, 5));
        // inbuilt
        System.out.println(str.substring(0, 4));
    }
}
