package daydaychange.p00003;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/3 7:31 AM
 */
class LongestSubstringWithoutRepeatingCharactersTest {


    LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void lengthOfLongestSubstringCase1() {
        assertEquals(0, solution.lengthOfLongestSubstring(null));
        assertEquals(0, solution.lengthOfLongestSubstringV2(null));
    }

    @Test
    void lengthOfLongestSubstringCase2() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
        assertEquals(0, solution.lengthOfLongestSubstringV2(""));
    }

    @Test
    void lengthOfLongestSubstringCase3() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbbbbb"));
        assertEquals(1, solution.lengthOfLongestSubstringV2("bbbbbbbb"));
    }

    @Test
    void lengthOfLongestSubstringCase4() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, solution.lengthOfLongestSubstringV2("abcabcbb"));
    }

    @Test
    void lengthOfLongestSubstringCase5() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(3, solution.lengthOfLongestSubstringV2("pwwkew"));
    }

    @Test
    void lengthOfLongestSubstringCase6() {
        assertEquals(2, solution.lengthOfLongestSubstring("au"));
        assertEquals(2, solution.lengthOfLongestSubstringV2("au"));
    }

    @Test
    void lengthOfLongestSubstringCase7() {
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
        assertEquals(3, solution.lengthOfLongestSubstringV2("dvdf"));
    }

    @Test
    void lengthOfLongestSubstringCase8() {
        assertEquals(3, solution.lengthOfLongestSubstring("aabaab!bb"));
        assertEquals(3, solution.lengthOfLongestSubstringV2("aabaab!bb"));
    }
}