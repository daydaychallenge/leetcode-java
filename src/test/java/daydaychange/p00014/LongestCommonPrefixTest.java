package daydaychange.p00014;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/4 8:13 AM
 */
class LongestCommonPrefixTest {

    LongestCommonPrefix lcp = new LongestCommonPrefix();

    @Test
    void longestCommonPrefixCase1() {
        String[] strs = {};
        assertEquals("", lcp.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixCase2() {
        String[] strs = {"flower","flow","flight"};
        assertEquals("fl", lcp.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixCase3() {
        String[] strs = {"dog","racecar","car"};
        assertEquals("", lcp.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixCase4() {
        String[] strs = {"aaa","a","aa"};
        assertEquals("a", lcp.longestCommonPrefix(strs));
    }
}