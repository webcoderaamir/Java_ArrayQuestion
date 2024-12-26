// import java.util.*;

public class pushZeroToEnd {
    
    public static void main(String[] args) {          // T.C -> O(n) S.C -> O(1)
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZeroToEnd(arr);

        // output
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroToEnd(int[] arr) {
        
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {

                // swap the current element with the zero
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;

            }
        }

    }

}
