// import java.util.*;

public class reverseAnArray {
    
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };
        reverseArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int[] arr) {

        // Better approach using two pointers
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }


        // optimal approach
        // int n = arr.length;

        // for (int i = 0; i < n / 2; i++) {

        //     int temp = arr[i];
        //     arr[i] = arr[n - i - 1];
        //     arr[n - i - 1] = temp;

        // }
    }

}
