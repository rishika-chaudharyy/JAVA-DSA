//Given an integer array nums, return all the triplets [nums[i],nums[j],nums[k]] such that i!=j i!=k and j!=k and nums[i]+nums[j]+nums[k]==0 . Notice that the solution must not contain duplicate or triplets

public class ArrayTriplets {
    public static void findTriplet(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println("(" + array[i] + "," + array[j] + "," + array[k] + ")");
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        int array[] = { 0, -1, 2, -3, 1 };
        findTriplet(array);
    }
}