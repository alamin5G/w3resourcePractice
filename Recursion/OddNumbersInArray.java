package Recursion;

import java.util.Arrays;

public class OddNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 23,  7, 8, 11, 9, 20, 4};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Number of odd numbers: " + oddNumbers(arr, arr.length-1, 0));
        System.out.println("Sum of all odd numbers: " + sumOfOddNumbers(arr, arr.length-1, 0));

    }

    public static int oddNumbers(int[] arr, int end, int count) {
        if (arr.length == 0) {
            return 0;
        }
        if (end < 0 ){
            return count;
        }
        if (arr[end] % 2 != 0) {
            count = count + 1;
            end -= 1;
        }else{
            end -= 1;
        }
        return oddNumbers(arr, end, count);
    }

    public static int sumOfOddNumbers(int[] arr, int end, int count) {
        if (arr.length == 0) {
            return 0;
        }
        if (end < 0 ){
            return count;
        }
        if (arr[end] % 2 != 0) {
            count = count + arr[end];
            end -= 1;
        }else {
            end -= 1;
        }
        return sumOfOddNumbers(arr, end, count);
    }
}
