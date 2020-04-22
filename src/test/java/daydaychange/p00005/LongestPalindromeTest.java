package daydaychange.p00005;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/14 8:38 AM
 */
class LongestPalindromeTest {

    LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    void longestPalindromeCase1() {
        assertEquals("abaddaba", longestPalindrome.longestPalindrome("babaddabad"));
        assertEquals("abaddaba", longestPalindrome.longestPalindromeV2("babaddabad"));

    }

    @Test
    void longestPalindromeCase2() {
        assertEquals("bb", longestPalindrome.longestPalindrome("cbbd"));
        assertEquals("bb", longestPalindrome.longestPalindromeV2("cbbd"));
    }


    @Test
    void longestPalindromeCase3() {
        assertEquals("badab", longestPalindrome.longestPalindrome("babadab"));
        assertEquals("badab", longestPalindrome.longestPalindromeV2("babadab"));
    }


    @Test
    void longestPalindromeCase4() {
        assertEquals("a", longestPalindrome.longestPalindrome("a"));
        assertEquals("a", longestPalindrome.longestPalindromeV2("a"));
    }


}