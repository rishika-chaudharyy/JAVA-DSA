import java.util.*;

public class Meaning_mean {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Use Scanner for simple input

    int t = sc.nextInt(); // Read number of test cases
    while (t-- > 0) {
      int n = sc.nextInt(); // Read size of the array

      int[] arr = new int[n]; // Declare the array
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt(); // Read the elements of the array
      }

      Arrays.sort(arr); // Sort the array

      int sum = arr[0]; // Initialize sum with the first element
      for (int i = 1; i < n; i++) {
        sum = (sum + arr[i]) / 2; // Calculate sum as per the logic
      }

      System.out.println(sum); // Print the result
    }

    sc.close(); // Close the scanner
  }
}
