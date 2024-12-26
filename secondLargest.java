// import java.util.*;

class secondLargest {

    public static void main(String[] args) {     // T.C -> O(n) S.C -> O(1)
        int arr[] = {12, 35, 1, 10, 34, 1};

        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        int n = arr.length;

        int largest = -1, secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];                              // store largest element
            }

            else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];                       // store second largest element
            }
        }

        return secondLargest;
    }

}