package daydaychange.p00151;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author ZhangJiangke
 * @version 1.0
 */
class ReverseWords_ZJKTest {

    private ReverseWords_ZJK reverseWords = new ReverseWords_ZJK();

    @Test
    void reverseWordsCase1() {
        assertEquals("blue is sky the", reverseWords.reverseWordsV2("the sky is blue"));
    }

    @Test
    void reverseWordsCase2() {
        assertEquals("world! hello", reverseWords.reverseWordsV2("  hello world!  "));
    }

    @Test
    void reverseWordsCase3() {
        assertEquals("example good a", reverseWords.reverseWordsV2("a good   example"));
    }

    @Test
    void reverseWordsCase4() {
        assertEquals("", reverseWords.reverseWordsV2(""));
    }

    @Test
    void reverseWordsCase5() {
        assertEquals("", reverseWords.reverseWordsV2(" "));
    }

    @Test
    void reverseWordsCase6() {
        assertEquals("the", reverseWords.reverseWordsV2("the"));
    }

}