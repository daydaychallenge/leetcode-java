package daydaychange.p00151;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/15 2:10 PM
 */
class ReverseWordsTest {

    private ReverseWords reverseWords = new ReverseWords();

    @Test
    void reverseWordsCase1() {
        assertEquals("blue is sky the", reverseWords.reverseWords("the sky is blue"));
    }

    @Test
    void reverseWordsCase2() {
        assertEquals("world! hello", reverseWords.reverseWords("  hello world!  "));
    }

    @Test
    void reverseWordsCase3() {
        assertEquals("example good a", reverseWords.reverseWords("a good   example"));
    }

    @Test
    void reverseWordsCase4() {
        assertEquals("", reverseWords.reverseWords(""));
    }

    @Test
    void reverseWordsCase5() {
        assertEquals("", reverseWords.reverseWords(" "));
    }

    @Test
    void reverseWordsCase6() {
        assertEquals("the", reverseWords.reverseWords("the"));
    }

}