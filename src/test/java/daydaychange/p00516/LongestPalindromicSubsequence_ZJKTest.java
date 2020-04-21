package daydaychange.p00516;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-21 10:51
 */
public class LongestPalindromicSubsequence_ZJKTest {

    LongestPalindromicSubsequence_ZJK palindromicSubsequence = new LongestPalindromicSubsequence_ZJK();

    @Test
    public void longestPalindromicSub() {
        int r = palindromicSubsequence.longestPalindromeSubseq("bbbab");
        Assertions.assertEquals(4, r);
    }


}
