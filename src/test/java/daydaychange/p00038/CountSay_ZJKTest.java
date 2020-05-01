package daydaychange.p00038;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountSay_ZJKTest {

    CountSay_ZJK countSay = new CountSay_ZJK();

    @Test
    public void test1() {
        Assertions.assertEquals("111221", countSay.countAndSay(5));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("", countSay.countAndSay(0));
    }

    @Test
    public void test3() {
        Assertions.assertEquals("1", countSay.countAndSay(1));
    }

    @Test
    public void test4() {
        Assertions.assertEquals("11", countSay.countAndSay(2));
    }

    @Test
    public void test5() {
        Assertions.assertEquals("312211", countSay.countAndSay(6));
    }

    @Test
    public void test6() {
        Assertions.assertEquals("13112221", countSay.countAndSay(7));
    }

}
