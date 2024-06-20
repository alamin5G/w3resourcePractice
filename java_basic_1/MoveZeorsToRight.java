package java_basic_1;

import java.util.Arrays;

import static java.util.Collections.swap;

public class MoveZeorsToRight {
    public static void main(String[] args) {
        int[] arr = {0, 3, 4, 0, 1, 2, 5, 0};

        System.out.println(Arrays.toString(arr));
       // moveZeorsToRight(arr);
       // System.out.println(Arrays.toString(arr));
        moveToRight(arr);
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
    //{0, 3, 4, 0, 1, 2, 5, 0};
    public static void moveToRight(int[] arr){

        int pos = 0;
        int len = 1;
        while (len != arr.length-1){
            if(arr[pos] == 0 && arr[len] != 0){
                swap(arr, pos, len);
                pos++;
            }
            len++;
        }
    }

    public static void swap(int[] arr, int j, int l){
        int t = arr[j];
        arr[j] = arr[l];
        arr[l] = t;
    }


}
