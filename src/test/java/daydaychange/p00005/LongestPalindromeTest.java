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
        assertEquals(longestPalindrome.longestPalindrome("babad"), "aba");
    }

    @Test
    void longestPalindromeCase2() {
        assertEquals(longestPalindrome.longestPalindrome("cbbd"), "bb");
    }


    @Test
    void longestPalindromeCase3() {
        assertEquals(longestPalindrome.longestPalindrome("babadab"), "badab");
    }


    @Test
    void longestPalindromeCase4() {
        assertEquals(longestPalindrome.longestPalindrome("a"), "a");
    }


}