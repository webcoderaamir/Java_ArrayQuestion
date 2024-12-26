import java.util.*;

public class ValidAnagram {

    // compare > sorting
    
    public static void main(String[] args) {
        
        String s = "rat", t = "car";
        boolean isAnagram = true;

        if (s.length() != t.length()) {
            isAnagram = false;
        }

        // convert string to characters
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        System.out.println(Arrays.equals(sArr, tArr));   // compare

    }

}
