// import java.util.*;

// Stock Buy and Sell – Max one Transaction Allowed
public class StockBnSOne {

    public static int maximumProfit(int prices[]) {

        int minValue = prices[0];
        int res = 0;

        for (int i = 1; i < prices.length; i++) {
            
            minValue = Math.min(minValue, prices[i]);            // store the min value

            res = Math.max(res, prices[i] - minValue);           // store the res value

        }

        return res;

    }
    
    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};       // 9 - 1 = 8

        System.out.println(maximumProfit(prices));
    }

}
