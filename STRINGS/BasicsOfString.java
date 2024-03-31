//Write a program to declare a String by two methods and input a string using both the input functions and analyze the difference . Next, find the length of the input String and then perform concatenation. Use charAt() method to print all the characters of the string

import java.util.*;

public class BasicsOfString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // declaring string with and without the 'new' keyword
        String str1 = "Rishika"; // this is declared by first method
        String str2 = new String("Rishika"); // this is declared using new keyword
        System.out.println(str1);
        System.out.println(str2);

        // taking string input from user
        System.out.println("Enter a string");
        String str3 = sc.next(); // takes only the first word
        System.out.println(str3);
        System.out.println("Enter a string");
        String str4 = sc.nextLine(); // takes the whole string
        System.out.println(str4);

        // finding length of all the strings
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str3.length());
        System.out.println(str4.length());

        // String concatenation
        String firstName = "Rishika";
        String lastName = new String("JH");
        System.out.println("The name is " + firstName + " " + lastName);

        // printing all the characters of a string using str.charAt()
        System.out.println("Enter a string");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
        sc.close();

    }
}