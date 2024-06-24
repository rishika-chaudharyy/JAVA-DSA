
// Given an array nums of positive integers, the goal is to reduce the sum of nums by at least half using a series of operations. In each operation, you can choose any number from nums and reduce it to exactly half the original value. 
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class MinimumOperationsHalveArray {
    static int minOps(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.size(); i++) {
            pq.add(-nums.get(i));
        }

        double temp = sum;
        int cnt = 0;
        while (temp > sum / 2) {
            int x = -pq.peek();
            pq.remove();
            temp -= Math.ceil(x * 1.0 / 2);
            pq.add(x / 2);
            cnt++;
        }

        return cnt;
    }

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(4, 6, 3, 9, 10, 2));
        int count = minOps(nums);
        System.out.println(count);
    }
}
