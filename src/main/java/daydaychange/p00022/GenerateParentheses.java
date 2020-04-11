package daydaychange.p00022;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/11 4:09 PM
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        if (n <= 0) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        generate(res, "", n, n);
        return res;
    }

    private void generate(List<String> res, String str, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(str);
            return;
        }
        if (left > 0) {
            generate(res, str + "(", left - 1, right);
        }
        if (right > left) {
            generate(res, str + ")", left, right - 1);
        }
    }

}
