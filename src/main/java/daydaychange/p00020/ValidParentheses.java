package daydaychange.p00020;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/10 2:06 PM
 */
public class ValidParentheses {

    private static final HashMap<Character, Character> pairs;

    static {
        pairs = new HashMap<>();
        pairs.put('(', ')');
        pairs.put('[', ']');
        pairs.put('{', '}');
    }

    public boolean isValidPair(String s) {
        if (s == null || s.length() == 0) return true;
        //Stack<Character> stack = new Stack<>();
        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                char left = stack.pop();
                if (!isValidPair(left, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isValidPair(char left, char right) {
        Character validRight = pairs.get(left);
        return validRight != null && right == validRight;
    }
}
