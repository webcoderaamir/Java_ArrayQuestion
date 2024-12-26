import java.util.*;

public class ProductArrayExceptSelf {          // Easy | Two Pointer Approach -> prefix postfix

    public static int[] productExceptSelf(int nums[]) {

        int res[] = new int[nums.length];
        Arrays.fill(res, 1);
        int left = 1, right = 1;

        for (int i = 0; i < nums.length; i++) {          // prefix
            res[i] = left;
            left *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {           // postfix
            res[i] *= right;
            right *= nums[i];
        }

        return res;
    }

    
    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 4};                // output [4 = 3*2 = 6 || 3 = 4*2 = 8 || 12, 24]  -> [24, 12, 8, 6]
        int[] result = productExceptSelf(nums);

        // Print the result
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(result));
    }

}
