package daydaychange.p00541;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/17 2:48 PM
 */
class ReverseStringIITest {

    ReverseStringII reverseStringII = new ReverseStringII();

    @Test
    void reverseStrCase1() {
        assertEquals("bacdfeg", reverseStringII.reverseStr("abcdefg", 2));
    }

    @Test
    void reverseStrCase2() {
        assertEquals("bac", reverseStringII.reverseStr("abc", 2));
    }

    @Test
    void reverseStrCase3() {
        assertEquals("ba", reverseStringII.reverseStr("ab", 2));
    }

    @Test
    void reverseStrCase4() {
        assertEquals("b", reverseStringII.reverseStr("b", 2));
    }
}