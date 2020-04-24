package daydaychange.p00043;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/24 10:59 PM
 */
class MultiplyStringsTest {

    MultiplyStrings multiplyStrings = new MultiplyStrings();

    @Test
    void multiplyCase1() {
        assertEquals("0", multiplyStrings.multiply("0", "123"));
    }

    @Test
    void multiplyCase2() {
        assertEquals("56088", multiplyStrings.multiply("456", "123"));
    }

    @Test
    void multiplyCase3() {
        assertEquals("246", multiplyStrings.multiply("2", "123"));
    }

    @Test
    void multiplyCase4() {
        assertEquals("123", multiplyStrings.multiply("1", "123"));
    }
}