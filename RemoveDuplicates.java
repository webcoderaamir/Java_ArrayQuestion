import java.util.*;

public class RemoveDuplicates {

    public static int removeElements(int nums[]) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;     // remove duplicates
            } else {
                nums[count++] = nums[i];        // add unique one
            }
        }

        return count;

    }


    
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        // System.out.print(Arrays.toString(removeElements(arr)));
        System.out.print(Arrays.toString(Arrays.copyOf(arr, removeElements(arr))));    // Truncated array

    }

}
