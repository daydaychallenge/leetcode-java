package daydaychange.p00541;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-17 10:45
 */
public class ReverseStringII_ZJKTest {

    ReverseStringII_ZJK reverseString = new ReverseStringII_ZJK();

    @Test
    public void reverseString() {
        Assertions.assertEquals("bacdfeg", reverseString.reverseStr("abcdefg", 2));
    }

    @Test
    public void reverseString1() {
        Assertions.assertEquals("abcdefg", reverseString.reverseStr("abcdefg", 1));
    }

    @Test
    public void reverseString2() {
        Assertions.assertEquals("cbadefg", reverseString.reverseStr("abcdefg", 3));
    }

    @Test
    public void reverseString3() {
        Assertions.assertEquals("dcbaefg", reverseString.reverseStr("abcdefg", 4));
    }

}
