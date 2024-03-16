//Write a prohram to create an marks array and perform basic operations like input , output and update . Also calculate the percentage and display the length of the array

import java.util.*;

public class ArrayOperations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[10];// creating an array

        // input marks by user
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // input rest of the marks by user using loops
        for (int i = 3; i < 10; i++) {
            marks[i] = sc.nextInt();
        }

        // finding the length of the array
        System.out.println("The length of the array is:" + marks.length);

        // displaying all the marks using loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // updating and displaying marks
        System.out.println("Updated marks");
        marks[2] = marks[0] + 2;
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // finding the percentage of all the marks
        int averageMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            averageMarks += marks[i];
        }

        // displaying percentage
        System.out.println("The percentage of the marks obtained is :" + averageMarks / marks.length);

        sc.close();
    }
}