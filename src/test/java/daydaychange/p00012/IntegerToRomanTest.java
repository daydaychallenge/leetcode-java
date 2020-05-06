package daydaychange.p00012;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/6 5:24 PM
 */
class IntegerToRomanTest {

    IntegerToRoman solution = new IntegerToRoman();

    @Test
    void intToRomanCase1() {
        assertEquals("I", solution.intToRoman(1));
    }

    @Test
    void intToRomanCase2() {
        assertEquals("III", solution.intToRoman(3));
    }

    @Test
    void intToRomanCase3() {
        assertEquals("IV", solution.intToRoman(4));
    }

    @Test
    void intToRomanCase4() {
        assertEquals("IX", solution.intToRoman(9));
    }

    @Test
    void intToRomanCase5() {
        assertEquals("LVIII", solution.intToRoman(58));
    }

    @Test
    void intToRomanCase6() {
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }
}