import java.util.*;

public class Elephant {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(); // The target position
    int minsteps = 0;

    // Calculate the number of full 5-steps
    minsteps += x / 5;

    // Check if there is any remaining distance
    if (x % 5 != 0) {
      minsteps++; // Add one more step for the remaining distance
    }

    System.out.println(minsteps); // Print the total number of steps

    sc.close();
  }
}
