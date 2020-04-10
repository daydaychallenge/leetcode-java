package daydaychange.p00020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/10 2:28 PM
 */
class ValidParenthesesTest {

    private ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void isValidCase1() {
        assertEquals(true, validParentheses.isValidPair(null));
    }

    @Test
    void isValidCase2() {
        assertEquals(true, validParentheses.isValidPair(""));
    }

    @Test
    void isValidCase3() {
        assertEquals(false, validParentheses.isValidPair("([)]"));
    }

    @Test
    void isValidCase4() {
        assertEquals(true, validParentheses.isValidPair("((()(())))"));
    }

    @Test
    void isValidCase5() {
        assertEquals(true, validParentheses.isValidPair("()[]{}"));
    }

    @Test
    void isValidCase6() {
        assertEquals(true, validParentheses.isValidPair("()[]{}"));
    }

    @Test
    void isValidCase7() {
        assertEquals(false, validParentheses.isValidPair("()[a]{}"));
    }

}