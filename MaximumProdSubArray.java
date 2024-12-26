public class MaximumProdSubArray {

    public static int maxProduct(int[] arr) {                            

        int n = arr.length;
        int maxProduct = Integer.MIN_VALUE;

        int left = 1;
        int right = 1;

        for (int i = 0; i < n; i++) {

            if (left == 0) left = 1;
            if (right == 0) right = 1;

            left *= arr[i];

            int j = n - i - 1;
            right *= arr[j];

            maxProduct = Math.max(left, Math.max(right, maxProduct));

        } 

        return maxProduct;

    }

    public static void main(String[] args) {

        int[] arr = { -2, 6, -3, -10, 0, 2 };
        System.out.println(maxProduct(arr));

    }

}
