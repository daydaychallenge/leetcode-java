package daydaychange.p00186;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-16 11:04
 */
public class ReverseWordsII_ZJK {

    public void reverseWords(char[] s) {
        int left = 0, right = s.length - 1;
        reverseWord(s, left, right);
        left = 0;
        while (left < s.length) {
            int k = left;
            while (k < s.length && s[k] != ' ') k ++;
            reverseWord(s, left, k - 1);
            left = k + 1;
        }
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
