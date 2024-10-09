import java.util.Scanner;

public class sumOfAandBAgain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

    while (t-- > 0) {
      int n = scanner.nextInt();
      int sum = (n / 10) + (n % 10);
      System.out.println(sum);
    }
    scanner.close();
  }
}