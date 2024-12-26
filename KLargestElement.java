import java.util.*;

public class KLargestElement {

    public static int[] findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();      // 1. Initialize minHeap

        for (int i = 0; i < k; i++) {
            minHeap.add(nums[i]);                                   //  2. Add first [5,9,3] K elements to minHeap
        }

        for (int i = k; i < nums.length; i++) {                     // 3. add the each remain elements and maintain k
            minHeap.add(nums[i]);
            if (minHeap.size() > k) {     
                minHeap.poll();                  
            }
        }

        // 4. Extract top K largest elements from the min heap
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }
    
    public static void main(String[] args) {

        int nums[] = {5, 9, 3, 4, 8, 2};
        int k = 3;

        System.out.println(Arrays.toString(findKthLargest(nums, k)));
    }

}
