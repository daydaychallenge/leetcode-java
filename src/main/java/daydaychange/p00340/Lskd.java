package daydaychange.p00340;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/6 7:03 PM
 */
public class Lskd {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int n = s.length();
        if (n * k == 0) return 0;

        int maxLen = 1;
        // sliding window left and right pointers
        int left = 0, right = 0;
        // hashmap character -> its rightmost position
        // in the sliding window
        Map<Character, Integer> map = new HashMap<>();

        while (right < s.length()) {
            // add new character and move right pointer
            char ch = s.charAt(right);
            map.put(ch, right++);
            // slidewindow contains K characters
            if (map.size() == k + 1) {
                Integer delIndex = Collections.min(map.values());
                map.remove(s.charAt(delIndex));
                // move left pointer of the slidewindow
                left = delIndex + 1;
            }

            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }
}
