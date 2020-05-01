package daydaychange.p00003;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharacters_ZJKTest {
    LongestSubstringWithoutRepeatingCharacters_ZJK longestSubstring = new LongestSubstringWithoutRepeatingCharacters_ZJK();

    @Test
    public void test1() {
        Assertions.assertEquals(3, longestSubstring.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(1, longestSubstring.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(3, longestSubstring.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(12, longestSubstring.lengthOfLongestSubstring("abcdefaglkpmnbcd"));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(2, longestSubstring.lengthOfLongestSubstring("au"));
    }

    @Test
    public void test6() {
        Assertions.assertEquals(5, longestSubstring.lengthOfLongestSubstring("tmmzuxt"));
    }

}
