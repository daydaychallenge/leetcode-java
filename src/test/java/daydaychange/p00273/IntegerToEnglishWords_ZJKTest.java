package daydaychange.p00273;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/3 6:37 AM
 */
class IntegerToEnglishWords_ZJKTest {

    IntegerToEnglishWords_ZJK converter = new IntegerToEnglishWords_ZJK();

    @Test
    void numberToWordsCase1() {
        assertEquals("Zero", converter.numberToWords(0));
    }

    @Test
    void numberToWordsCase2() {
        assertEquals("One Million", converter.numberToWords(1000000));
    }

    @Test
    void numberToWordsCase3() {
        assertEquals("Twelve Thousand Three Hundred Forty Five", converter.numberToWords(12345));
    }

    @Test
    void numberToWordsCase4() {
        assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven",
                converter.numberToWords(1234567));
    }

    @Test
    void numberToWordsCase5() {
        assertEquals("One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One",
                converter.numberToWords(1234567891));
    }
}