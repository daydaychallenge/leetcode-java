package daydaychange.p00121;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{3,2,6,5,0,3}));

    }

    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            if (buy > price) {
                buy = price;
            } else if (price - buy > profit) {
                profit = price - buy;
            }
        }
        return profit;
    }

}
