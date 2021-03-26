package daydaychange.p00115;

import java.util.Arrays;

/**
 * Given two strings s and t, return the number of distinct subsequences of s which equals t.
 * A string's subsequence is a new string formed from the original string by deleting some (can be none) of the
 * characters without disturbing the remaining characters' relative positions.
 * (i.e., "ACE" is a subsequence of "ABCDE" while "AEC" is not).
 * It is guaranteed the answer fits on a 32-bit signed integer.
 *
 * Example 1:
 * Input: s = "rabbbit", t = "rabbit"
 * Output: 3
 * Explanation:
 * As shown below, there are 3 ways you can generate "rabbit" from S.
 * rabbbit
 * rabbbit
 * rabbbit
 * Example 2:
 *
 * Input: s = "babgbag", t = "bag"
 * Output: 5
 * Explanation:
 * As shown below, there are 5 ways you can generate "bag" from S.
 * babgbag
 * babgbag
 * babgbag
 * babgbag
 * babgbag
 *
 * Constraints:
 *
 * 0 <= s.length, t.length <= 1000
 * s and t consist of English letters.
 */
public class DistinctSubsequences {

    public static void main(String[] args) {
        String s = "rabbbit", t = "rabbit";
        int c = numDistinct(s, t);
        System.out.println(c);
    }

    public static int numDistinct(String s, String t) {
        if (s == null || s.isEmpty()) return 0;
        if (t == null || t.isEmpty()) return 1;

        int[][] dp = new int[t.length() + 1][s.length() + 1];
        for (int i = 0; i < s.length(); i ++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < t.length() + 1; i ++) {
            for (int j = 1; j < s.length() + 1; j++) {
                if (s.charAt(j - 1) == t.charAt(i - 1))
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
                else dp[i][j] = dp[i][j - 1];
            }
        }
        return dp[t.length()][s.length()];
    }

    public static int numDistinct0MS(String s, String t) {
        char[] ss = s.toCharArray(), ts = t.toCharArray();
        int slen = ss.length, tlen = ts.length;

        int[] lastIdx = new int[128];
        int[] prevIdx = new int[tlen];
        Arrays.fill(lastIdx, -1);

        for (int i = 0; i < tlen; i++) {
            prevIdx[i] = lastIdx[ts[i]];
            lastIdx[ts[i]] = i;
        }

        int[] dp = new int[tlen + 1];
        dp[0] = 1;

        for (int i = 0; i < slen; i++) {
            for (int j = lastIdx[ss[i]]; j != -1; j = prevIdx[j]) {
                dp[j + 1] += dp[j];
            }
        }
        return dp[tlen];
    }

    public static int numDistinct1MS(String s, String t){
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        int n = a.length;
        int m = b.length;
        int[] dp = new int[m + 1];
        dp[m] = 1;
        for (int i = n - 1; i >= 0; i--)
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j])
                    dp[j] += dp[j + 1];
            }
        return dp[0];
    }

}
