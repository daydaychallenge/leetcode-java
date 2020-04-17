package daydaychange.p00541;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-17 10:30
 */
public class ReverseStringII_ZJK {
    public String reverseStr(String s, int k) {
        if (s == null || s.isEmpty()) return "";
        if (k == 1) return s;

        int len = s.length();
        char[] chars = s.toCharArray();
        int start = 0;
        while (start < len) {
            if (start + k >= len) {
                reverseWord(chars, start, len - 1);
                break;
            }
            int end = start + k - 1;
            reverseWord(chars, start, end);
            start = start + 2 * k;
        }
        return new String(chars);
    }

    private void reverseWord(char[] s, int start, int end) {
        while (start < end) {
            char t = s[start];
            s[start] = s[end];
            s[end] = t;
            start ++;
            end --;
        }
    }
}
