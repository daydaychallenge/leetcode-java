package daydaychange.p00005;

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

    /**
     * 时间复杂度O(n^2)
     */
    public String longestPalindromeV2(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            //回文串长度为偶数
            int lena = expendAroundCenter(s, i, i);
            //回文串长度为奇数
            int lenb = expendAroundCenter(s, i, i + 1);
            int len = Math.max(lena, lenb);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expendAroundCenter(String s, int left, int right) {
        //  left代表回文串左半部分的结束位置
        //  right代表回文串右半部分的开始位置
        int l = left, r = right;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        return r - l - 1;
    }
}
