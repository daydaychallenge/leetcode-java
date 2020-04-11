package daydaychange.p00032;

import java.util.Stack;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-11 14:49
 */
public class LongestValidParentheses_ZJK {

    public int longestValidParentheses(String s) {
        int ans = 0;
        if (s == null || s.isEmpty()) return ans;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i ++) {
            char c = chars[i];
            if (c == '(') {
                stack.push(i);
            } else if (c == ')'){
                stack.pop();
                if (stack.isEmpty()) stack.push(i);
                ans = Math.max(ans, i - stack.peek());
            }
        }
        return ans;
    }

}
