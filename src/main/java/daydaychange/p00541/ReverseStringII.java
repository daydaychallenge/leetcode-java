package daydaychange.p00541;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/17 2:37 PM
 */
public class ReverseStringII {

    public String reverseStr(String s, int k) {
        if (s == null || k > s.length()) return s;
        int loop = s.length() / (2 * k);
        if (s.length() % (2 * k) != 0) loop++;

        char[] chars = s.toCharArray();
        for (int i = 0; i <= loop; i++) {
            int start = i * 2 * k;
            int end = start + k - 1;
            if (end > chars.length) {
                end = chars.length - 1;
            }
            reverse(chars, start, end);
        }

        return String.valueOf(chars);
    }

    private void reverse(char[] chars, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            char tmp = chars[j];
            chars[j] = chars[i];
            chars[i] = tmp;
        }
    }
}
