package daydaychange.p00006;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-13 15:08
 */
public class ZigZagConversion_ZJKTest {
    ZigZagConversion_ZJK zigZagConversion = new ZigZagConversion_ZJK();

    String s = "PAYPALISHIRING";

    @Test
    public void testRowNum3() {
        String result = zigZagConversion.convert(s, 3);
        Assertions.assertEquals("PAHNAPLSIIGYIR", result);
    }

    @Test
    public void testRowNum4() {
        String result = zigZagConversion.convert(s, 4);
        Assertions.assertEquals("PINALSIGYAHRPI", result);
    }

    @Test
    public void testRowNum5() {
        String result = zigZagConversion.convert(s, 5);

        Assertions.assertEquals("PHASIYIRPLIGAN", result);
    }

}
