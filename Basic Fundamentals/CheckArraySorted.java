public class CheckArraySorted {
    
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5, 6};
        boolean isSorted = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println("Sorted : " + isSorted);

    }

}
