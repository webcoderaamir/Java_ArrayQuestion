// import java.util.*;

public class Permutation {

    public static void nextPermutation(int[] arr) {

        int n = arr.length;

        // find the pivot
        int pivot = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // if pivot not exists reverse the array
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // find the greatest elem from right than pivot
        for (int i = n - 1; i >= pivot; i--) {
            if (arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }

        // reverse from pivot + 1 to end of array
        reverse(arr, pivot + 1, n - 1);

    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 5, 4 }; // output -> 1 2 4 3 5 6 means next high order value
        nextPermutation(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
