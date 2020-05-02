package daydaychange.p00038;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/3 7:13 AM
 */
class CountSayTest {
    CountSay countSay = new CountSay();

    @Test
    void countAndSayCase1() {
        assertEquals("1", countSay.countAndSay(1));
    }

    @Test
    void countAndSayCase2() {
        assertEquals("11", countSay.countAndSay(2));
    }

    @Test
    void countAndSayCase3() {
        assertEquals("21", countSay.countAndSay(3));
    }

    @Test
    void countAndSayCase4() {
        assertEquals("1211", countSay.countAndSay(4));
    }

    @Test
    void countAndSayCase5() {
        assertEquals("111221", countSay.countAndSay(5));
    }
}