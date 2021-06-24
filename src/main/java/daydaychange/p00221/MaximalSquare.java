package daydaychange.p00221;

public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        if (matrix.length == 1) {
            for (int i = 0; i < matrix[0].length; i ++) {
                if (matrix[0][i] == '1') return 1;
            }
            return 0;
        }
        if (matrix[0].length == 1) {
            for (char[] chars : matrix) {
                if (chars[0] == '1') {
                    return 1;
                }
            }
            return 0;
        }
        int m = matrix.length, n = matrix[0].length;
        int[] dp = new int[n + 1];
        int prev = 0, maxLen = 0;
        for (int i = 1; i < m + 1; i ++) {
            for (int j = 1; j < n + 1; j ++) {
                int temp = dp[j];
                if (matrix[i - 1][j - 1] == '1') {
                    dp[j] = Math.min(Math.min(prev, dp[j - 1]), dp[j]) + 1;
                    maxLen = Math.max(maxLen, dp[j]);
                } else dp[j] = 0;
                prev = temp;
            }
        }
        return maxLen * maxLen;
    }

}
