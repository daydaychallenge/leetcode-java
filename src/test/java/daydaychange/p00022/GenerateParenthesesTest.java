package daydaychange.p00022;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/11 4:25 PM
 */
class GenerateParenthesesTest {

    GenerateParentheses generateParentheses = new GenerateParentheses();

    @Test
    void generateParenthesisCase1() {
        List<String> res = generateParentheses.generateParenthesis(0);
        assertEquals(0, res.size());
    }

    @Test
    void generateParenthesisCase2() {
        List<String> res = generateParentheses.generateParenthesis(3);
        assertEquals(5, res.size());
    }
}