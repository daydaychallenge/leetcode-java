package daydaychange.p00647;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-21 11:26
 */
public class PalindromicSubstrings_ZJKTest {

    PalindromicSubstrings_ZJK palindromicSubstrings = new PalindromicSubstrings_ZJK();

    @Test
    public void test1() {
        Assertions.assertEquals(6, palindromicSubstrings.countSubstrings("aaa"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(3, palindromicSubstrings.countSubstrings("abc"));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(4, palindromicSubstrings.countSubstrings("aba"));
    }

}
