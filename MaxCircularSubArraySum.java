public class MaxCircularSubArraySum {

    public static int circularSubarraySum(int[] arr) {

        int totalSum = 0;
        int currMaxSum = 0, currMinSum = 0;
        int maxSum = arr[0], minSum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            // find max
            currMaxSum = Math.max(currMaxSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currMaxSum);

            // find min
            currMinSum = Math.min(currMinSum + arr[i], arr[i]);
            minSum = Math.min(minSum, currMinSum);

            // total sum
            totalSum += arr[i];

        }

        int normalSum = maxSum;
        int circularSum = totalSum - minSum;

        // if minSum equal to totalSum
        if (minSum == totalSum)
        return normalSum;

        return Math.max(normalSum, circularSum);

    }
    
    public static void main(String[] args) {

        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(circularSubarraySum(arr));

    }

}
