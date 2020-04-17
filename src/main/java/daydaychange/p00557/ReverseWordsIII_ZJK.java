package daydaychange.p00557;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-17 10:00
 */
public class ReverseWordsIII_ZJK {

    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) return "";
        char[] originChars = s.toCharArray();
        for (int i = 0, size = originChars.length; i < size; ) {
            int k = i;
            while (k < size && originChars[k] != ' ') k ++;
            reverseWord(originChars, i, k - 1);
            i = k + 1;
        }

        return new String(originChars);
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
