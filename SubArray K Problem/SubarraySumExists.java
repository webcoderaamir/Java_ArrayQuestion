public class SubarraySumExists {
    
    // Find if a subarray with a given sum exists
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12, sum = 0, st = 0;

        boolean found = false;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            if (sum > target) sum -= arr[st++];

            if (sum == target) {
                found = true;
                System.out.println("Subarray found from index " + st + " to " + end);
                break;
            }
        }
        
        System.out.println("subarray found: " + found);
    }

    // prefix sum ----- subarrSum[i, j] = PS[j] - PS[i - 1]
    // k = PS[j] - PS[i - 1]
    // PS[i - 1] = PS[j] - k

}
