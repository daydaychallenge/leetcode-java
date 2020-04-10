package daydaychange.p00020;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author ZhangJk
 * @Date 2020-04-10 10:35
 */
public class ValidParentheses_ZJK {

    public boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (int i = 0, size = chars.length; i < size; i ++) {
            char c = chars[i];
            switch (c) {
                case '(': deque.push(')'); break;
                case '{': deque.push('}'); break;
                case '[': deque.push(']'); break;
                case ')':
                case ']':
                case '}':
                    if (deque.isEmpty() || c != deque.pop()) {
                        return false;
                    }
                    break;
                default: return false;
            }
        }
        return deque.isEmpty();
    }
}
