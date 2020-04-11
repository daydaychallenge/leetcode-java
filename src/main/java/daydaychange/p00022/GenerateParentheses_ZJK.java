package daydaychange.p00022;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-11 13:43
 */
public class GenerateParentheses_ZJK {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(0, n, n, new char[2 * n], ans);
        return ans;
    }

    private void helper(int index, int left, int right, char[] chars, List<String> ans) {
        if (index == chars.length) {
            ans.add(new String(chars));
            return;
        }
        if (left > 0) {
            chars[index] = '(';
            helper(index + 1, left - 1, right, chars, ans);
        }
        if (right > left) {
            chars[index] = ')';
            helper(index + 1, left, right - 1, chars, ans);
        }
    }


}
