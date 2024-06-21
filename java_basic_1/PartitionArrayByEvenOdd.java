package java_basic_1;

import java.util.Arrays;

public class PartitionArrayByEvenOdd {

    public static void main(String[] args){
        int[] arr = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        partition(arr);
        System.out.println("After Partitioning Array: ");
        System.out.println(Arrays.toString(arr));

    }

    public static void partition(int[] arr){

        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            if(arr[left] % 2 != 0 && arr[right] % 2 == 0){
                swap(arr, left, right);
                right--;
                left++;
            }else{
                left++;
            }

        }
    }

    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
