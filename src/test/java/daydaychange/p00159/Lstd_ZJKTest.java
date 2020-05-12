package daydaychange.p00159;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/6 5:54 PM
 */
class Lstd_ZJKTest {

    Lstd_ZJK lstd = new Lstd_ZJK();

    @Test
    void lengthOfLongestSubstringTwoDistinctCase1() {
        assertEquals(3, lstd.lengthOfLongestSubstringTwoDistinct("eceba"));
    }

    @Test
    void lengthOfLongestSubstringTwoDistinctCase2() {
        assertEquals(5, lstd.lengthOfLongestSubstringTwoDistinct("ccaabbb"));
    }

    @Test
    void lengthOfLongestSubstringTwoDistinctCase3() {
        assertEquals(5, lstd.lengthOfLongestSubstringTwoDistinct("aaaaa"));
    }

    @Test
    void lengthOfLongestSubstringTwoDistinctCase4() {
        assertEquals(2, lstd.lengthOfLongestSubstringTwoDistinct("ab"));
    }

    @Test
    void lengthOfLongestSubstringTwoDistinctCase5() {
        assertEquals(10, lstd.lengthOfLongestSubstringTwoDistinct("abccbbcccaaacaca"));
    }

    @Test
    void lengthOfLongestSubstringTwoDistinctCase6() {
        assertEquals(4, lstd.lengthOfLongestSubstringTwoDistinct("abaccc"));
    }
}