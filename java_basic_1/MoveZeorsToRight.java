package java_basic_1;

import java.util.Arrays;

import static java.util.Collections.swap;

public class MoveZeorsToRight {
    public static void main(String[] args) {
        int[] arr = {0, 3, 4, 0, 1, 2, 5, 0};

        System.out.println(Arrays.toString(arr));
        moveZeorsToRight(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void moveZeorsToRight(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while (left != right){
            if (arr[left] == 0 && arr[right] != 0){
                swap(arr, left, right);
                right--;
            }else if(arr[left] == 0 && arr[right] == 0){
                right--;
            }else{
                left++;
            }
        }
    }

    public static void swap(int[] arr, int j, int l){
        int t = arr[j];
        arr[j] = arr[l];
        arr[l] = t;
    }


}
