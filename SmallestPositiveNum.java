public class SmallestPositiveNum {

    public static int missingNumber(int[] arr) {
        int n = arr.length;

        // Cyclic sort: Place numbers in their correct positions
        for (int i = 0; i < n; i++) {
            while (arr[i] >= 1 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                // Swap arr[i] with arr[arr[i] - 1]
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }

        // Debug: Print array after cyclic sort
        System.out.println("Array after sorting: " + java.util.Arrays.toString(arr));

        // Find the first missing positive number
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // If all numbers are present, return n + 1
        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4};
        System.out.println("Smallest missing positive number: " + missingNumber(arr));
    }
}


//  sorting swap > find missing > n + 1
