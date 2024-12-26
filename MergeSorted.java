import java.util.*;

public class MergeSorted {

    public static void mergeArrays(int[] arr1, int[] arr2, int m, int n) {

        int r1 = m - 1;
        int r2 = n - 1;
        int w = m + n - 1;

        // Merge arrays from the end
        while (r2 >= 0) {
            if (r1 >= 0 && arr1[r1] > arr2[r2]) {
                arr1[w--] = arr1[r1--];
            } else {
                arr1[w--] = arr2[r2--];
            }
        }

    }
    
    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};

        int m = 3;
        int n = 3;

        mergeArrays(arr1, arr2, m, n);

        System.out.println(Arrays.toString(arr1));

    }

}
