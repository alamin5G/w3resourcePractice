package Algorithm;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] arr2 = {2, 9, 5, 7, 1, 4, 3};

        System.out.println("Original Array: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After Sorting using mergesort: " + Arrays.toString(arr));

        System.out.println("Original Array: " + Arrays.toString(arr2));
        mergeSort(arr2, 0, arr2.length - 1);
        System.out.println("After Sorting using mergesort: " + Arrays.toString(arr2));

    }
    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }

    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int n1  = mid - low + 1;
        int n2  = high - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        //copying left sub array in to array of L
        for (int i = 0; i < n1; i++) {
            L[i] = arr[low + i];
        }
        //copying right sub-array in to array of R
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        //set i, j and k value;
        //where i will work for left side and j will work for right side of the array
        //and k will be the index of the main array
        int i = 0; int j = 0; int k = low;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            }else{
                arr[k++] = R[j++];
            }

        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}
