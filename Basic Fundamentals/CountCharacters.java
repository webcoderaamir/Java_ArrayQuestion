import java.util.*;

// Count characters in a string using a dictionary
public class CountCharacters {
    
    public static void main(String[] args) {
        
        String str = "hello";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

}
