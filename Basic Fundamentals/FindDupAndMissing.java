import java.util.*;

public class FindDupAndMissing {
    
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        
        List<Integer> Dup = new ArrayList<>();
        List<Integer> missing = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {        // 1. cyclic sorting
            while (nums[i] != nums[nums[i] - 1]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {       // 2. find dup and missing
            if (nums[i] != i + 1) {
                Dup.add(nums[i]);
                missing.add(i + 1);
            }
        }

        // return new int[] {Dup, missing};

        System.out.println("Duplicates: " + Dup);
        System.out.println("Missing: " + missing);
    }

}
