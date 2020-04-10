package daydaychange.p00020;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author ZhangJk
 * @Date 2020-04-10 10:54
 */
public class ValidParentheses_ZJKTest {

    ValidParentheses_ZJK valid = new ValidParentheses_ZJK();

    @Test
    public void validTrue() {
        String parentheses = "()[({})]{()}";
        Assertions.assertEquals(Boolean.TRUE, valid.isValid(parentheses));
    }

    @Test
    public void validFalse() {
        String parentheses = "()[({}){()}";
        Assertions.assertEquals(Boolean.FALSE, valid.isValid(parentheses));
    }

}
