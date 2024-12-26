import java.util.*;

public class ReverseArray {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }

        System.out.println("Reversed array: " + Arrays.toString(arr));

    }

}
