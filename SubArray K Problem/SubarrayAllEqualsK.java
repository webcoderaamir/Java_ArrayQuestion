public class SubarrayAllEqualsK {
    
    // Calculate the sum of every subarrays of size k
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3, sum = 0;

        for (int i = 0; i < arr.length - k + 1; i++) {
            sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            System.out.println("Sum of subarray [" + i + ", " + (i + k - 1) + "] = " + sum);
        }

    }

}
