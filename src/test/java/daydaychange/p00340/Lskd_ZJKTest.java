package daydaychange.p00340;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/6 7:17 PM
 */
class Lskd_ZJKTest {
    Lskd_ZJK lskd = new Lskd_ZJK();

    @Test
    void lengthOfLongestSubstringKDistinctCase1() {
        assertEquals(3, lskd.lengthOfLongestSubstringKDistinct("eceba", 2));
    }

    @Test
    void lengthOfLongestSubstringKDistinctCase2() {
        assertEquals(2, lskd.lengthOfLongestSubstringKDistinct("aa", 1));
    }

    @Test
    void lengthOfLongestSubstringKDistinctCase3() {
        assertEquals(7, lskd.lengthOfLongestSubstringKDistinct("ccaabbb", 3));
    }

    @Test
    void lengthOfLongestSubstringKDistinctCase4() {
        assertEquals(1, lskd.lengthOfLongestSubstringKDistinct("a", 2));
    }
}