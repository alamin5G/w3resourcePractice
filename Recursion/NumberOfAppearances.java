package Recursion;

import java.util.Arrays;

public class NumberOfAppearances {
    public static void main(String[] args) {
        System.out.println("Original Array: ");
        int[] arr = {5, 1, 3, 4, 5, 2};
        System.out.println(Arrays.toString(arr));
        int oc = numberOfAppearances(arr, arr.length-1, 6, 0);
        System.out.println(oc);
    }

    public static int numberOfAppearances(int[] arr, int len, int tar, int oc) {

        if (arr.length == 0) {
            return 0;
        }
        if (len < 0){
            return oc;
        }

        if (arr[len] == tar) {
           oc += 1;
           len -= 1;
        }else{
            len -= 1;
        }

        return numberOfAppearances(arr, len, tar, oc);
    }
}
