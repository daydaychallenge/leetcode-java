package daydaychange.p00022;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-11 13:57
 */
public class GenerateParentheses_ZJKTest {

    GenerateParentheses_ZJK generateParentheses = new GenerateParentheses_ZJK();

    @Test
    public void generateParentheses() {
        List<String> result = generateParentheses.generateParenthesis(3);
        Assertions.assertEquals(5, result.size());
    }

}
