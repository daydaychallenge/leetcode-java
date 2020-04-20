package daydaychange.p00647;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/20 1:46 PM
 */
class PalindromicSubstringsTest {

    PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();

    @Test
    void countSubstringsCase1() {
        int count = palindromicSubstrings.countSubstrings("abc");
        assertEquals(3, count);
    }

    @Test
    void countSubstringsCase2() {
        int count = palindromicSubstrings.countSubstrings("aaa");
        assertEquals(6, count);
    }

    @Test
    void countSubstringsCase3() {
        int count = palindromicSubstrings.countSubstrings("");
        assertEquals(0, count);
    }

    @Test
    void countSubstringsCase4() {
        int count = palindromicSubstrings.countSubstrings("a");
        assertEquals(1, count);
    }
}