package daydaychange.p00020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/10 2:28 PM
 */
public class ValidParenthesesTest {

    private ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void isValidCase1() {
        assertEquals(true, validParentheses.isValidPair(null));
    }

    @Test
    public void isValidCase2() {
        assertEquals(true, validParentheses.isValidPair(""));
    }

    @Test
    public void isValidCase3() {
        assertEquals(false, validParentheses.isValidPair("([)]"));
    }

    @Test
    public void isValidCase4() {
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
    public void isValidCase7() {
        assertEquals(false, validParentheses.isValidPair("()[a]{}"));
    }

}