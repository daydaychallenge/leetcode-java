package daydaychange.p00013;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-13 14:11
 */
public class RomanToInteger_ZJKTest {

    RomanToInteger_ZJK romanToInteger = new RomanToInteger_ZJK();

    @Test
    public void romanToInt58() {
        Assertions.assertEquals(58, romanToInteger.romanToInt("LVIII"));
    }

    @Test
    public void romanToInt1994() {
        Assertions.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }

    @Test
    public void romanToInt9() {
        Assertions.assertEquals(9, romanToInteger.romanToInt("IX"));
    }

    @Test
    public void romanToInt4() {
        Assertions.assertEquals(4, romanToInteger.romanToInt("IV"));
    }

    @Test
    public void romanToInt3() {
        Assertions.assertEquals(3, romanToInteger.romanToInt("III"));
    }

}
