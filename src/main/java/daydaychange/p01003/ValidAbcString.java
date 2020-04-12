package daydaychange.p01003;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/12 10:12 AM
 */
public class ValidAbcString {

    public boolean isValid(String S) {
//        Stack<Character> stack = new Stack<>();
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch != 'c') {
                stack.push(ch);
            } else {
                if (stack.size() < 2) {
                    return false;
                }
                Character sec = stack.pop();
                Character fir = stack.pop();
                if (sec != 'b' || fir != 'a') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}
