package java_basic_1;

import java.util.HashMap;
import java.util.Map;

public class SingleOccurNumber {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 20, 30, 40, 40, 30, 50};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], 0);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }
    }
}
