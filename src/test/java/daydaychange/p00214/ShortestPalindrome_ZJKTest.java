package daydaychange.p00214;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-21 12:08
 */
public class ShortestPalindrome_ZJKTest {
    ShortestPalindrome_ZJK shortestPalindrome = new ShortestPalindrome_ZJK();

    @Test
    public void test1() {
        Assertions.assertEquals("aaacecaaa", shortestPalindrome.shortestPalindrome("aacecaaa"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("dcbabcd", shortestPalindrome.shortestPalindrome("abcd"));
    }

}
