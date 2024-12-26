public class SearchinRotatedSortedArray {
    
    // Find the position of a target element in a sorted and rotated array

    // Binary search ->       mid = st + (end - st) / 2
    public static void main(String[] args) {
        
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0, st = 0, end = arr.length - 1, pos = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                pos = mid;
                break;
            }

            if (arr[st] <= arr[mid]) {  // left sorted

                if (arr[st] <= target && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }

            } else {   // right sorted

                if (arr[mid] <= target && target <= arr[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
        }

        System.out.println("Position of target in array: " + pos);
    }
    
}
