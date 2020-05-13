package daydaychange.p00010;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/11 2:02 PM
 */
class RegularExpressionMatchingTest {

    RegularExpressionMatching rem = new RegularExpressionMatching();

    @Test
    void isMatchCase1() {
        assertEquals(false, rem.isMatch("aa", "a"));
        assertEquals(false, rem.isMatchDp("aa", "a"));
    }

    @Test
    void isMatchCase2() {
        assertEquals(true, rem.isMatch("aa", "a*"));
        assertEquals(true, rem.isMatchDp("aa", "a*"));
    }

    @Test
    void isMatchCase3() {
        assertEquals(true, rem.isMatch("ab", ".*"));
        assertEquals(true, rem.isMatchDp("ab", ".*"));
    }

    @Test
    void isMatchCase4() {
        assertEquals(true, rem.isMatch("aab", "c*a*b"));
        assertEquals(true, rem.isMatchDp("aab", "c*a*b"));
    }

    @Test
    void isMatchCase5() {
        assertEquals(false, rem.isMatch("mississippi", "mis*is*p*."));
        assertEquals(false, rem.isMatchDp("mississippi", "mis*is*p*."));
    }

    @Test
    void isMatchCase6() {
        assertEquals(true, rem.isMatch("aaaa", "a*"));
        assertEquals(true, rem.isMatchDp("aaaa", "a*"));
    }
}