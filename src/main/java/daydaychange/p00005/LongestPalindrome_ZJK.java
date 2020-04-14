package daydaychange.p00005;

/**
 * @author ZhangJiangke
 * @version 1.0
 * @date 2020/4/14
 */
public class LongestPalindrome_ZJK {

    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) return s;
        int len = s.length();
        int begin = 0, maxLen = 0;
        for (int i = 0; i < len - maxLen / 2; ) {
            int j = i, k = i;
            while (k < len - 1 && s.charAt(k) == s.charAt(k + 1)) {
                k ++;
            }
            i = k + 1;
            while (j > 0 && k < len - 1 && s.charAt(j - 1) == s.charAt(k + 1)) {
                j --;
                k ++;
            }
            int newLen = k - j + 1;
            if (newLen > maxLen) {
                begin = j;
                maxLen = newLen;
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}
