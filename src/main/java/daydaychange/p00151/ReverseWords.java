package daydaychange.p00151;

import java.util.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/15 2:10 PM
 */
public class ReverseWords {

    public String reverseWords(String s) {
        if (s == null) return s;
        s = s.trim();
        List<String> words = Arrays.asList(s.split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }

    public String reverseWordsV2(String s) {
        if (s == null) return s;

        int left = 0, right = s.length() - 1;
        while (left <= right && s.charAt(left) == ' ') {
            left++;
        }
        while (left <= right && s.charAt(right) == ' ') {
            right--;
        }
        Deque<String> res = new LinkedList<>();
        StringBuilder word = new StringBuilder();
        for (int i = left; i <= right; i++) {
            if (word.length() != 0 && s.charAt(i) == ' ') {
                res.addFirst(word.toString());
                word.setLength(0);
            } else if (s.charAt(i) != ' ') {
                word.append(s.charAt(i));
            }
        }

        res.addFirst(word.toString());

        return String.join(" ", res);
    }
}
