package daydaychange.p00186;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/16 4:25 PM
 */
public class ReverseWordsII {

    public void reverseWords(char[] s) {
        revert(s, 0, s.length - 1);
        int start = 0, cur = 0;
        while (cur < s.length) {
            if (s[cur] == ' ') {
                revert(s, start, cur - 1);
                start = cur + 1;
            }
            if (cur == s.length - 1) {
                revert(s, start, cur);
            }
            cur++;
        }

    }

    private void revert(char[] s, int p, int q) {
        int start = p, end = q;
        while (start < end) {
            char tmp = s[end];
            s[end] = s[start];
            s[start] = tmp;
            start++;
            end--;
        }
    }
}
