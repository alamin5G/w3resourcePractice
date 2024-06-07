package java_basic_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge2SortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1, 3, 4, 6};

        int i = 0;
        int j = 0;
        int k = arr1.length+ arr2.length;
        int l = 0;
        int[] result = new int[k];
        while (l != k ){
            if (arr1[i] > arr2[j]){
                result[l] = arr2[j];
                if (j < arr2.length-1){
                    j++;
                }

            }else{
                result[l] = arr1[i];
                if (i < arr2.length-1){
                    i++;
                }
            }
            l++;
        }

        System.out.println(Arrays.toString(result));
    }
}
