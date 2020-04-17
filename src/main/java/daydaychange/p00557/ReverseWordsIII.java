package daydaychange.p00557;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/17 2:08 PM
 */
public class ReverseWordsIII {

    public String reverseWords(String s) {
        if (s == null) return s;
        char[] chars = s.toCharArray();
        int start = 0, end = 0;
        while (end < chars.length) {
            if (chars[end] == ' ') {
                reverseWord(chars, start, end - 1);
                start = end + 1;
            }
            if (end == chars.length - 1) {
                reverseWord(chars, start, end);
            }
            end++;
        }

        return String.valueOf(chars);
    }

    private void reverseWord(char[] words, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            char tmp = words[j];
            words[j] = words[i];
            words[i] = tmp;

        }
    }
}
