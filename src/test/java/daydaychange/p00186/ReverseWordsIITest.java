package daydaychange.p00186;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/16 4:25 PM
 */
class ReverseWordsIITest {

    private ReverseWordsII reverseWordsII = new ReverseWordsII();

    @Test
    void reverseWords() {
        char[] src = {'t', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'};
        System.out.println(Arrays.toString(src));
        char[] exp = {'b', 'l', 'u', 'e', ' ', 'i', 's', ' ', 's', 'k', 'y', ' ', 't', 'h', 'e'};
        assertArrayEquals(exp, src);
    }

}