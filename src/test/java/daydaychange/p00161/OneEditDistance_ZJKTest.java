package daydaychange.p00161;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @auth: Zhangjk
 * @Date: 2020/5/11 6:05 下午
 */
public class OneEditDistance_ZJKTest {

    OneEditDistance_ZJK editDistance = new OneEditDistance_ZJK();

    @Test
    public void test1() {
        Assertions.assertEquals(Boolean.TRUE, editDistance.isOneEditDistance("ab", "acb"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(Boolean.TRUE, editDistance.isOneEditDistance("1203", "1213"));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(Boolean.FALSE, editDistance.isOneEditDistance("abc", "ad"));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(Boolean.FALSE, editDistance.isOneEditDistance(null, "ad"));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(Boolean.FALSE, editDistance.isOneEditDistance("", "ad"));
    }

    @Test
    public void test6() {
        Assertions.assertEquals(Boolean.TRUE, editDistance.isOneEditDistance("a", ""));
    }

    @Test
    public void test7() {
        Assertions.assertEquals(Boolean.FALSE, editDistance.isOneEditDistance("c", "c"));
    }

    @Test
    public void test8() {
        Assertions.assertEquals(Boolean.FALSE, editDistance.isOneEditDistance("a", "ac"));
    }

}
