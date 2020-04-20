package daydaychange.p00516;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/20 3:38 PM
 */
class LongestPalindromicSubsequenceTest {

    @Test
    void longestPalindromeSubseqCase1() {
        LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
        assertEquals(4, lps.longestPalindromeSubseq("bbbab"));
    }

    @Test
    void longestPalindromeSubseqCase2() {
        LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
        assertEquals(2, lps.longestPalindromeSubseq("cbbd"));
    }
}