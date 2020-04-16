package daydaychange.p00151;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-16 07:17
 */
public class ReverseWords_ZJK {
    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        int left = 0;
        List<String> words = new ArrayList<>();
        for (int i = 0; i < s.length(); ) {
            while (left < s.length() && s.charAt(left) == ' ') {
                left ++;
            }
            while (left < s.length() && s.charAt(left) != ' ') {
                sb.append(s.charAt(left));
                left ++;
            }
            i = left;
            if (sb.length() > 0) {
                words.add(sb.toString());
                sb.setLength(0);
            }
        }
        for (int i = words.size() - 1; i >= 0; i --) {
            sb.append(words.get(i)).append(" ");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public String reverseWordsV2(String s) {
        if (s == null || s.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        int right = s.length() - 1;
        boolean empty = false;
        while (right >= 0) {
            while (right >= 0 && s.charAt(right) == ' ') right --;
            int k = right;
            while (k >= 0 && s.charAt(k) != ' ') k --;
            if (k < right && empty) sb.append(" ");
            sb.append(s, k + 1, right + 1);
            empty = true;
            right = k;
        }
        return sb.toString();
    }
}
