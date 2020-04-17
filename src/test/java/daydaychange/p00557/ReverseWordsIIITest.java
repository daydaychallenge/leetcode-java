package daydaychange.p00557;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/17 2:08 PM
 */
class ReverseWordsIIITest {

    ReverseWordsIII reverseWords = new ReverseWordsIII();

    @Test
    void reverseWords() {
        String s = "Let's take LeetCode contest";
        String exp = "s'teL ekat edoCteeL tsetnoc";
        assertEquals(exp, reverseWords.reverseWords(s));

    }
}