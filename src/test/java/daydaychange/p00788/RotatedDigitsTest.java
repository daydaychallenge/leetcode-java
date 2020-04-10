package daydaychange.p00788;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/9 5:05 PM
 */
class RotatedDigitsTest {

    private RotatedDigits rotatedDigits = new RotatedDigits();

    @Test
    void rotatedDigits() {
        assertEquals(4, rotatedDigits.rotatedDigits(10));
    }
}