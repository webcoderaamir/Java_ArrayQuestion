// import java.util.*;

public class StockBnSTwo {

    public static int maximumProfit(int[] prices) {        // Accumulate Profit - O(n) Time and O(1) Space

        int res = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] > prices[i - 1]) {
                res += prices[i] - prices[i - 1];     // Accumulate Profit
            }

        }

        return res;
        
    }

    
    public static void main(String[] args) {
        
        int prices[] = {100, 180, 260, 310, 40, 535, 695};
        // int prices[] = {4, 2, 2, 2, 4};

        System.out.println(maximumProfit(prices));

    }

}
