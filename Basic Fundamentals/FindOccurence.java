public class FindOccurence {
    
    // Count the occurrences of a specific element in an array
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 2, 4, 2};
        int target = 2, count = 0;

        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("Number " + target + " occurs " + count + " times.");
    }

}
