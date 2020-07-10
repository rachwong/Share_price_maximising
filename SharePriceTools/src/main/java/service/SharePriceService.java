package service;

public class SharePriceService {
    public int getMaxProfit(int[] stockPrices) {
        int maxProfitDifference = stockPrices[1] - stockPrices[0];
        int minStockPrice = stockPrices[0];

        for (int i = 1; i < stockPrices.length; i++) {
            if (stockPrices[i] - minStockPrice > maxProfitDifference) {
                maxProfitDifference = stockPrices[i] - minStockPrice;
            }
            if (stockPrices[i] < minStockPrice) {
                minStockPrice = stockPrices[i];
            }
        }

        return Math.max(maxProfitDifference, 0);
    }
}
