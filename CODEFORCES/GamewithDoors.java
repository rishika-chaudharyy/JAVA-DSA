import java.util.Scanner;

public class GamewithDoors {

  // Function to solve the problem
  public static void solve(Scanner sc) {
    int l = sc.nextInt(); // Read l
    int r = sc.nextInt(); // Read r
    int L = sc.nextInt(); // Read L
    int R = sc.nextInt(); // Read R

    r++; // Increment r by 1
    R++; // Increment R by 1

    // Check if the ranges do not overlap
    if (r <= L || R <= l) {
      System.out.println(1);
    } else {
      // Ensure l is the smaller of the two left bounds
      if (l > L) {
        int temp = l;
        l = L;
        L = temp;
      }
      // Ensure r is the smaller of the two right bounds
      if (r > R) {
        int temp = r;
        r = R;
        R = temp;
      }
      // Output the result by calculating the overlap
      System.out.println(Math.min(r, R - 1) - Math.max(l + 1, L) + 1);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); // Read the number of test cases

    while (t-- > 0) {
      solve(sc); // Solve each test case
    }

    sc.close(); // Close Scanner only once after all input is read
  }
}
