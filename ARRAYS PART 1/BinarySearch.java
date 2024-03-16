//Write a program to search for an element in an array using binary search

//Time complexity is O(log n)
public class BinarySearch {

    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String agrs[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;

        int index = binarySearch(numbers, key);
        if (index == -1) {
            System.out.println("Key NOT found");
        } else {
            System.out.println("Key found at index :" + index);
        }

    }
}
