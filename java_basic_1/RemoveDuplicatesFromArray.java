package java_basic_1;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 8};
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {

            if(arr[i-1] != arr[i]){
                list.add(arr[i]);
            }
        }

        System.out.println(list);
    }
}
