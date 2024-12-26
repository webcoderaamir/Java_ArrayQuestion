import java.util.*;

public class MajorityElemTwo {

    public static List<Integer> findMajority(int[] arr) {

        int n = arr.length;

        // initialize the candidate and their counts
        int candidate1 = -1, candidate2 = -1, count1 = 0, count2 = 0;

        for (int i : arr) {

            if (candidate1 == i) {
                count1++;
            }
            else if (candidate2 == i) {
                count2++;
            }

            else if (count1 == 0) {
                candidate1 = i;
                count1++;
            }
            else if (count2 == 0) {
                candidate2 = i;
                count2++;
            }

            else {
                count1--;
                count2--;
            }

        }

        List<Integer> result = new ArrayList<>();
        count1 = 0;
        count2 = 0;

        for (int i : arr) {
            if (candidate1 == i) count1++;
            if (candidate2 == i) count2++;
        }

        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3 && candidate1 != candidate2) result.add(candidate2);

        if (result.size() == 2 && result.get(0) > result.get(1)) {
            int temp = result.get(0);
            result.set(0, result.get(1));
            result.set(1, temp);
        }

        return result;

    }

    
    public static void main(String[] args) {
        
        int[] arr = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        // int[] arr = {1, 2, 3, 4, 5};

        List<Integer> result = findMajority(arr);

        for (int i : result) {
            System.out.print(i + " ");
        }

    }

}
