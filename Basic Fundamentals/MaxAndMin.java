class MaxAndMin {

    // Find the largest and smallest number in an array

    public static void main(String[] args) {
        
        int[] arr = {3, 5, 1, 8, 2};
        int max = arr[0], min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Max : " + max + " min : " + min);

    }

}