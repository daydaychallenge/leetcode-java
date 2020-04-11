package daydaychange.p00032;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-11 15:01
 */
public class LongestValidParentheses_ZJKTest {

    LongestValidParentheses_ZJK validParentheses = new LongestValidParentheses_ZJK();

    @Test
    public void longestValidParentheses() {
        int ret = validParentheses.longestValidParentheses(")(((((()())()()))()(()))(");
        Assertions.assertEquals(22, ret);
    }

}
