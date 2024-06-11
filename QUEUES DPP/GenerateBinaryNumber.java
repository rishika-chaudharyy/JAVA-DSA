import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumber {
    public static void generateBinaryNumbers(int N) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 1; i <= N; i++) {
            // Get the front element of the queue
            String current = queue.poll();
            // Print the current binary number
            System.out.print(current + " ");
            // Generate the next binary numbers and add them to the queue
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }

    public static void main(String[] args) {
        int N1 = 2;
        System.out.print("Binary numbers from 1 to " + N1 + ": ");
        generateBinaryNumbers(N1);
        System.out.println();

        int N2 = 5;
        System.out.print("Binary numbers from 1 to " + N2 + ": ");
        generateBinaryNumbers(N2);
    }
}
