import java.util.*;

public class MostFrequentElem {
    
    // Find the most frequent element in an array
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 2, 3, 3, 3};

        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0, mostFreq = -1;

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > maxFreq) {
                maxFreq = map.get(num);
                mostFreq = num;
            }
        }
        
        System.out.println("Most frequent elem: " + mostFreq);
    }

}
