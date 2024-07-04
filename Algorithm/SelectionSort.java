package Algorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Original Array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Selection Sort: " + Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            BubbleSort.swap(arr, minIndex, i);
        }
    }
}
