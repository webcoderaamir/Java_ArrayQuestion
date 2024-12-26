import java.util.*;

public class FindMissingAndRepeatGrid {     // Easy

    public static int[] findMissingAndRepeated(int[][] grid) {
        
        int n = grid.length;
        Set<Integer> seen = new HashSet<>();
        int repeated = -1;

        int totalSum = (n * n * (n * n + 1)) / 2;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                currentSum += num;

                if (!seen.add(num)) {
                    repeated = num;
                }
            }
        }

        int missing = totalSum - (currentSum - repeated);

        return new int[] { repeated, missing };
    }

    public static void main(String[] args) {
        int[][] grid2 = { { 9, 1, 7 }, { 8, 9, 2 }, { 3, 4, 6 } };

        System.out.println(Arrays.toString(findMissingAndRepeated(grid2)));   // Output: [ Rep: 9, Mis: 5]
    }

}
