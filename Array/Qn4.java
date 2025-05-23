public class Qn4 {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int i=1; i<prices.length; i++) {
            if (buy < prices[i]) {
                profit = Math.max(prices[i] - buy, profit);
            } else {
                buy = prices[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices1 = {7, 6, 4, 3, 1};
        
        System.out.println("Profit : "+ maxProfit(prices));
        System.out.println("Profit : "+ maxProfit(prices1));

    }
}
