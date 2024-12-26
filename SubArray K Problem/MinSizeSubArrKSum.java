// import java.util.*;

public class MinSizeSubArrKSum {

    public static int minSubArrayLen(int[] nums, int target) {

        int sum = 0, minLen = Integer.MAX_VALUE;

        for (int start = 0, end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= nums[start++];
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;

    }
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};             // 4, 3 = 2 minSize
        int target = 7;

        System.out.println(minSubArrayLen(arr, target));
    }

}
