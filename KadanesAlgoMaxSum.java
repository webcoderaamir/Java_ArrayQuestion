public class KadanesAlgoMaxSum {

    public static int maxSumSubArray(int[] arr) {

        int maxSum = arr[0];
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {

            maxSum = Math.max(maxSum + arr[i], arr[i]);

            res = Math.max(res, maxSum);
        }

        return res;
        
    }
    
    public static void main(String[] args) {
        
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        // int arr[] = {-2, -4};
        System.out.println(maxSumSubArray(arr));

    }

}
