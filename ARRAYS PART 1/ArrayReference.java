//Write a program to prove that elements in array are passed by reference in a function and others are passed by values

public class ArrayReference {

    public static void arrayUpdater(int numbers[], int nonChangeable) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 1;
            nonChangeable = 10;
        }
    }

    public static void main(String args[]) {

        int numbers[] = { 97, 98, 99 };
        int nonChangeable = 5;

        arrayUpdater(numbers, nonChangeable); // calling the function

        // printing the values
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println(nonChangeable);
    }
}
