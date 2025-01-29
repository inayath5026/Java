package Arrays;

public class BuyAndSell2 {

    public static int buySellStocks(int prices[]){

        int currProfit=0;
        int maxProfit=0;

        for(int i=1;i<prices.length;i++){

            int diff = prices[i] - prices[i-1];
            currProfit = Math.max(diff, diff+currProfit);
            maxProfit = Math.max(currProfit, maxProfit);

        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buySellStocks(prices));
    }
}
