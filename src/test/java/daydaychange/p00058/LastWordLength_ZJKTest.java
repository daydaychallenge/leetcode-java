package daydaychange.p00058;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @auth: Zhangjk
 * @Date: 2020/5/18 10:05 上午
 */
public class LastWordLength_ZJKTest {
    LastWordLength_ZJK lastWordLength = new LastWordLength_ZJK();


    @Test
    public void test() {
        Assertions.assertEquals(5, lastWordLength.lengthOfLastWord("hello world   "));
    }

    @Test
    public void test1() {
        Assertions.assertEquals(1, lastWordLength.lengthOfLastWord(" a"));
    }

}
