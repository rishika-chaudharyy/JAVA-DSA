//For a given integer arrau of size n , You have to find all the occurences(indices) of the given element key and print them . Use a recursive function to solve this problem

public class FindAllOccurences {
    public static void findAllOccurences(int arr[], int key, int i) {
        // base case
        if (i == arr.length) {
            return;
        }
        // kaam

        if (arr[i] == key) {
            System.out.print(i + " ");
        }

        findAllOccurences(arr, key, i + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 5, 4, 6, 2, 7, 8, 2, 2 };
        int key = 2;
        findAllOccurences(arr, key, 0);

    }
}