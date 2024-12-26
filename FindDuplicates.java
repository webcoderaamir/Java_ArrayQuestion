import java.util.*;

public class FindDuplicates {

    public static void findDup(int[] arr) {

        HashSet<Integer> duplicates = new HashSet<>();
        HashSet<Integer> seen = new HashSet<>();

        for (int i : arr) {
            if (!seen.add(i)) {      // add nhi kr pata toh wo elem pahle se h then wo duplicate h   (false)
                duplicates.add(i);
            }
        }

        if(duplicates.isEmpty()) {
            System.out.println("No duplicates found");
        } else {
            System.out.println("Duplicates found: " + duplicates);
        }

    }
    
    public static void main(String[] args) {

        int[] arr = {4, 2, 4, 5, 2, 3, 1};
        findDup(arr);

    }

}
