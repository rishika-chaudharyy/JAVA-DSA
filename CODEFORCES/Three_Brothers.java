import java.util.*;

public class Three_Brothers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if ((a == 1 && b == 2) || (a == 2 && b == 1)) {
      System.out.println(3);
    } else if ((a == 2 && b == 3) || (a == 3 && b == 2)) {
      System.out.println(1);
    } else {
      System.out.println(2);
    }
    sc.close();
  }
}
