package daydaychange.p00005;

import java.util.Stack;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/14 8:12 AM
 */
public class LongestPalindrome {

    /**
     * 暴力 时间复杂度O(n^3)
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) return s;

        int maxLen = 1, startIndex = 0;
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (isPalindrome(s, j, i)) {
                        maxLen = Math.max(maxLen, i - j + 1);
                        startIndex = j;
                    }
                }
            }
        }

        return s.substring(startIndex, startIndex + maxLen);
    }

    private boolean isPalindrome(String s, int start, int end) {
        int mid = start + (end - start) / 2;
        for (int i = start; i <= mid; i++) {
            if (s.charAt(i) != s.charAt(end - i + start)) {
                return false;
            }
        }
        return true;
    }
}
