package daydaychange.p00013;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/13 2:58 PM
 */
class RomanToIntegerTest {

    RomanToInteger romanToInt = new RomanToInteger();

    @Test
    void romanToIntCase1() {
        assertEquals(5, romanToInt.romanToInt("V"));
    }

    @Test
    void romanToIntCase2() {
        assertEquals(4, romanToInt.romanToInt("IV"));
    }

    @Test
    void romanToIntCase3() {
        assertEquals(3, romanToInt.romanToInt("III"));
    }

    @Test
    void romanToIntCase4() {
        assertEquals(9, romanToInt.romanToInt("IX"));
    }

    @Test
    void romanToIntCase5() {
        assertEquals(58, romanToInt.romanToInt("LVIII"));
    }

    @Test
    void romanToIntCase6() {
        assertEquals(1994, romanToInt.romanToInt("MCMXCIV"));
    }


}