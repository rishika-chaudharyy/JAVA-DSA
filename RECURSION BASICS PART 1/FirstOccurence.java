//Write a function to find the first occurence of an element in an array using Recursion
//TC is O(n)
//SC is O(n)

public class FirstOccurence {
    public static int firstOccurence(int array[], int key, int i) {
        // base case
        if (i == array.length) {
            // array.length-1 islye nahi kia kyuki what is key exists at last index? Toh fir
            // direct base case hit hokr return hojyga and aage check nahi hoga
            return -1;
        }

        // kaam
        if (array[i] == key) {
            return i;
        }

        // inner function call
        return firstOccurence(array, key, i + 1);
    }

    public static void main(String args[]) {
        int array[] = { 8, 2, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(firstOccurence(array, 3, 0));
    }
}
