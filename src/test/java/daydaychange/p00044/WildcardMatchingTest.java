package daydaychange.p00044;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/13 4:34 PM
 */
class WildcardMatchingTest {

    WildcardMatching solution = new WildcardMatching();

    @Test
    void isMatchCase1() {
        assertEquals(false, solution.isMatch("aa", "a"));
    }

    @Test
    void isMatchCase2() {
        assertEquals(true, solution.isMatch("aa", "*"));
    }

    @Test
    void isMatchCase3() {
        assertEquals(false, solution.isMatch("cb", "?a"));
    }

    @Test
    void isMatchCase4() {
        assertEquals(true, solution.isMatch("adceb", "*a*b"));
    }

    @Test
    void isMatchCase5() {
        assertEquals(false, solution.isMatch("acdcb", "a*c?b"));
    }

    @Test
    void isMatchCase6() {
        assertEquals(false, solution.isMatch("aaabbbaabaaaaababaabaaabbabbbbbbbbaabababbabbbaaaaba", "a*******b"));
    }

}