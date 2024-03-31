
//Write a program to check if two strings are anagrams or not
import java.util.*;

public class Anagram {
    public static boolean checkAnagram(String str1, String str2) {
        str1 = str1.toLowerCase(); // converting to lowecase so as not to check for boht cases
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) { // if length of both not equal then obviously not anagram
            return false;
        } else { // converting to character array using toCharArray so we can sort and check
            char str1Array[] = str1.toCharArray();
            char str2Array[] = str2.toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);
            return Arrays.equals(str1Array, str2Array);
        }
    }

    public static void main(String args[]) {
        String str1 = "heart";
        String str2 = "earth";
        System.out.println(checkAnagram(str1, str2));
    }
}
