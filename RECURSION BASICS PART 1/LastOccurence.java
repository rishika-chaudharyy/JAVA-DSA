//Write a function to find the last occurence of the element in an array

public class LastOccurence {
    public static int lastOccurence(int array[], int key, int i) {
        // base case
        if (i == array.length) {
            return -1;
        }

        // inner function call
        int isFound = lastOccurence(array, key, i + 1);

        if (isFound != -1) {
            return isFound;
        }

        // check with self
        if (array[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String args[]) {
        int array[] = { 8, 3, 6, 9, 5, 5, 3 };
        System.out.println(lastOccurence(array, 5, 0));
    }
}
