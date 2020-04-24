package daydaychange.p00043;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-24 16:27
 */
public class MultiplyStrings_ZJKTest {
    MultiplyStrings_ZJK multiplyStrings = new MultiplyStrings_ZJK();

    @Test
    public void test1() {
        Assertions.assertEquals("184626", multiplyStrings.multiply("234", "789"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("0", multiplyStrings.multiply("0", "789"));
    }

    @Test
    public void test3() {
        Assertions.assertEquals("234", multiplyStrings.multiply("234", "1"));
    }

    @Test
    public void test4() {
        Assertions.assertEquals("0", multiplyStrings.multiply("234", ""));
    }

}
