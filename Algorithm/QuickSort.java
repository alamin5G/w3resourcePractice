package Algorithm;

import java.util.Arrays;

public class QuickSort
{
    public static void main(String[] args) {
        int[] arr = {5, 9, 1, 8, 2, 7, 3, 6, 4};
        System.out.println("Original Array: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After sorting using Quick Sort: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right){
        if(left < right){
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j <right ; j++) {
            if (arr[j] <= pivot) {
                i++;
                if(i == j) continue;
                swap(arr, i, j);
            }
        }
        swap(arr, right, i+1);
        return i+1;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
