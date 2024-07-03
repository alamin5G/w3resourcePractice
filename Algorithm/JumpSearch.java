package Algorithm;

public class JumpSearch {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564};
        int search_num = 120;

        // Find the index of searched item
        //int index_result = jumpSearch(nums, search_num);

        //System.out.println(search_num + " is found at index " + index_result);
        int block_size = (int)Math.floor(Math.sqrt(nums.length));
        System.out.println(block_size);


    }

}
