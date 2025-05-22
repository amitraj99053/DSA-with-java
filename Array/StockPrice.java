public class StockPrice {
    // stock profit calculator
    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {     // profit
                int profit = prices[i] - buyPrice;   // today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return  maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices1 = {6, 5, 2, 8, 4, 9};

        System.out.println("Profit of stock is : "+ buyAndSellStocks(prices));
        System.out.println("Profit of stock is : "+ buyAndSellStocks(prices1));

    }
}
