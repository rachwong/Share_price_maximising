import service.SharePriceService;

public class App {
    public static void main(String[] args) {
        final SharePriceService sharePriceService = new SharePriceService();
        int[] sharePrice = {10, 7, 5, 8, 11, 9};
        int[] sharePrice2 = {10, 10, 10, 10, 10, 10};
        int[] sharePrice3 = {0, 0, 0, 0};
        int[] sharePrice4 = {9, 8, 7, 6};

        System.out.println(sharePriceService.getMaxProfit(sharePrice));
        System.out.println(sharePriceService.getMaxProfit(sharePrice2));
        System.out.println(sharePriceService.getMaxProfit(sharePrice3));
        System.out.println(sharePriceService.getMaxProfit(sharePrice4));
    }
}
