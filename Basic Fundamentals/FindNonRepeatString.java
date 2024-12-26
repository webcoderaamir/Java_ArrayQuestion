// Find the first non-repeating character in a string
import java.util.*;

public class FindNonRepeatString {

    // HashMap > if 1 > break
    
    public static void main(String[] args) {
        
        String str = "swiss";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {      
                System.out.println("First non-repeating character: " + c);
                break;
            }
        }

    }

}
