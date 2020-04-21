package daydaychange.p00516;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-18 20:19
 */
public class LongestPalindromicSubsequence_ZJK {

    public int longestPalindromeSubseq(String s) {

        if (s == null || s.isEmpty()) return 0;
        int[][] dp = new int[s.length()][s.length()];
//        for (int i = s.length() - 1; i >= 0; i--) {
//            dp[i][i] = 1;
//            for (int j = i + 1; j < s.length(); j ++) {
//                if (s.charAt(i) == s.charAt(j)) {
//                    dp[i][j] = 2 + dp[i + 1][j - 1];
//                } else dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
//            }
//        }
        dp[0][0] = 1;
        for (int i = 1; i < s.length(); i ++) {
            dp[i][i] = 1;
            for (int j = i - 1; j >= 0; j --) {
                if (s.charAt(i) == s.charAt(j)) dp[j][i] = 2 + dp[j + 1][i - 1];
                else dp[j][i] = Math.max(dp[j + 1][i], dp[j][i - 1]);
            }
        }

        return dp[0][s.length() - 1];


    }

}
