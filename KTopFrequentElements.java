import java.util.*;

public class KTopFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {

        // minHeap approach

        Map<Integer, Integer> frequencyMap = new HashMap<>();      // Build frequency map using HashMap
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Use a min heap to keep track of the top K elements
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()
        );

        // Add each entry to heap, and maintain size K
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Extract top k elements from minHeap
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll().getKey();
        }

        return result;




        // Sorting Approach

        // Map<Integer, Integer> frequencyMap = new HashMap<>();         // Build frequency map
        // for (int num : nums) {
        //     frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        // }

        // // Sort the entries by frequency in descending order
        // List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        // entryList.sort((a, b) -> b.getValue() - a.getValue());

        // // Extract top k elements
        // int[] result = new int[k];
        // for (int i = 0; i < k; i++) {
        //     result[i] = entryList.get(i).getKey();
        // }

        // return result;


    }

    
    public static void main(String[] args) {
        
        int nums[] = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] topKFrequent = topKFrequent(nums, k);
        System.out.println(Arrays.toString(topKFrequent));    // [1, 2]

    }

}
