import java.util.*;

// Find the unique elements in a list
public class UniqueElements {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 2, 3, 3, 4};
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }

    }

}
