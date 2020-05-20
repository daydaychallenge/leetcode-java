package daydaychange.p00076;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @auth: Zhangjk
 * @Date: 2020/5/20 6:26 下午
 */
public class MinimumWindowSubstring_ZJKTest {

    MinimumWindowSubstring_ZJK minimumWindowSubstring = new MinimumWindowSubstring_ZJK();

    @Test
    public void test1() {
        Assertions.assertEquals("BANC", minimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
    }

}
