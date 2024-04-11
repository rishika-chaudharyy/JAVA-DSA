//Write a program to convert the uppercase to lowercase using bits
public class ConvertToLowerCase {
    public static void main(String args[]) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char) (ch | ' '));
        }
    }
}