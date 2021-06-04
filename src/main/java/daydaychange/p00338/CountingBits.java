package daydaychange.p00338;

public class CountingBits {
    public int[] countBits(int n) {
        if (n == 0) return new int[]{};
        int[] ans = new int[n + 1];
        ans[0] = 0;
        int pre = 0;
        for (int i = 1; i < n + 1; i ++) {
            if ((i & (i - 1)) == 0) {
                pre = i;
            }
            ans[i] = 1 + ans[i - pre];
        }
        return ans;
    }

    public int[] countBits1(int n) {
        if (n == 0) return new int[]{0};
        int[] ans = new int[n + 1];
        for (int i = 1; i < n + 1; i ++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}
