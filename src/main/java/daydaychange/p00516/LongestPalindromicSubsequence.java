package daydaychange.p00516;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/20 3:37 PM
 */
public class LongestPalindromicSubsequence {

    private int max = 0;

    /**
     * 回溯算法 分阶段考察每个字符
     */
    public int longestPalindromeSubseq(String s) {
        if (s == null || s.length() == 0) return 0;

        List<Character> seq = new ArrayList<>();
        findMaxLength(s, 0, 0, seq);

        return max;
    }

    private void findMaxLength(String s, int curPos, int curLen, List<Character> curSubSeq) {
        if (curPos == s.length()) {
            if (curLen > max) {
                max = curLen;
            }
            return;
        }

        //当前字符加入子序列
        curSubSeq.add(s.charAt(curPos));
        int len = curSubSeq.size();

        System.out.println("select:" + curPos + " " + curSubSeq);
        int curMax = Math.max(curLen, getLongestPalindromic(curSubSeq));
        findMaxLength(s, curPos + 1, curMax, curSubSeq);

        //当前字符不加入子序列
        if (len > 0) {
            curSubSeq.remove(len - 1);
        }
        System.out.println("not select:" + curPos + " " + curSubSeq);
        findMaxLength(s, curPos + 1, curLen, curSubSeq);
    }

    private int getLongestPalindromic(List<Character> chars) {
        System.out.println(chars);
        int maxLen = 1;
        for (int i = 0; i < chars.size(); i++) {
            for (int j = i + 1; j < chars.size(); j++) {
                if (isPalindromic(chars, i, j)) {
                    maxLen = Math.max(maxLen, (j - i + 1));
                }
            }
        }
        System.out.println(maxLen);
        return maxLen;
    }

    private boolean isPalindromic(List<Character> chars, int start, int end) {
        int l = start, r = end;
        while (l < r) {
            if (!chars.get(l).equals(chars.get(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
