package daydaychange.p00322;

public class CoinChange {

    public static void main(String[] args) {
        int[] coins = new int[]{1,2,5};
        System.out.println(coinChange(coins, 100));
    }

    public static int coinChange(int[] coins, int amount) {
        return helper(coins, amount, new int[amount]);
    }

    private static int helper(int[] coins, int amount, int[] count) {
        if (amount == 0) return 1;
        else if (amount < 0) return -1;
        if (count[amount - 1] != 0) return count[amount - 1];
        int c = Integer.MAX_VALUE;
        for (int coin : coins) {
            int curr = helper(coins, amount - coin, count);
            if (curr >= 0 || curr < c) {
                c = curr + 1;
            }
        }
        count[amount-1] = (c==Integer.MAX_VALUE) ? -1 : c;
        return count[amount-1];
    }

}
