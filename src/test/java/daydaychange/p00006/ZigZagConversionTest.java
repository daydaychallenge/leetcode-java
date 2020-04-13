package daydaychange.p00006;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/13 3:03 PM
 */
class ZigZagConversionTest {

    ZigZagConversion converter = new ZigZagConversion();

    @Test
    void convertCase1() {
        assertEquals("LCIRETOESIIGEDHN", converter.convert("LEETCODEISHIRING", 3));
    }

    @Test
    void convertCase2() {
        assertEquals("LDREOEIIECIHNTSG", converter.convert("LEETCODEISHIRING", 4));
    }
}