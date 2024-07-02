package Algorithm;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("The Original Array: ");
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(arr));
        int index = binarySearch(arr, 10);
        if (index == -1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index " + index);
        }

    }
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (arr[mid] == key) {
                return mid;
            }else if (arr[mid] < key) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
