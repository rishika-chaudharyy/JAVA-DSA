import java.io.*;

public class Bus_to_penjamo {
  public static void main(String[] args) throws IOException {
    // Use BufferedReader for fast input
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // Read number of test cases
    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      // Read n and r
      String[] input = br.readLine().split(" ");
      int n = Integer.parseInt(input[0]);
      int r = Integer.parseInt(input[1]);

      // Read the array
      String[] arrStr = br.readLine().split(" ");
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(arrStr[i]);
      }

      int ans = 0;
      int odd = 0, sum = 0;

      // Calculate sum, count odd numbers, and compute ans
      for (int v : arr) {
        sum += v;
        if (v % 2 != 0) {
          odd++;
          ans += v - 1; // Subtract 1 for odd numbers
        } else {
          ans += v; // Add even numbers directly
        }
      }

      // Calculate available seats
      int seats = 2 * r - sum;

      // Adjust ans based on odd numbers and available seats
      if (odd >= seats) {
        ans += seats;
      } else {
        ans += odd;
      }

      // Output the result
      System.out.println(ans);
    }
  }
}
