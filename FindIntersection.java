import java.util.*;

public class FindIntersection {

    // <-------------------- Question intersection --------------------->
    public static void main(String[] args) {                    // output -> [4, 5, 6]
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {4, 5, 6, 7, 8, 9};

        HashSet<Integer> intersection = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : arr1) {
            intersection.add(num);
        }

        for (int num : arr2) {
            if (intersection.contains(num)) {
                result.add(num);
            }
        }

        System.out.print(result);

    }





    // <-------------------- Question union --------------------->

    // public static void main(String[] args) {                   // output -> [1, 2, 3, 4, 5, 6, 7, 8, 9]
    //     int[] arr1 = {1, 2, 3, 4, 5, 6};
    //     int[] arr2 = {4, 5, 6, 7, 8, 9};

    //     HashSet<Integer> union = new HashSet<>();

    //     for (int i = 0; i < arr1.length; i++)
    //     union.add(arr1[i]);

    //     for (int i = 0; i < arr2.length; i++)
    //     union.add(arr2[i]);

    //     System.out.print(union);
    // }


}
