import java.util.*;

// Remove duplicates from a list
public class RemoveDupFromList {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 4};
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set);

    }

}