package daydaychange.p00159;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/6 5:54 PM
 */
class LstdTest {

    Lstd lstd = new Lstd();

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
}