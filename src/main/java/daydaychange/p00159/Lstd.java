package daydaychange.p00159;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/6 5:35 PM
 */
public class Lstd {

    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s == null) return -1;

        // 滑动窗口 + 双指针
        int right = 0;
        int maxLen = 0;
        //TODO value为List 可以优化
        HashMap<Character, List<Integer>> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            while (right < s.length()) {
                Character ch = s.charAt(right);
                if (map.containsKey(ch)) {
                    List<Integer> ls = map.get(ch);
                    ls.add(right);
                    right++;
                } else if (map.size() < 2) {
                    List ids = new LinkedList();
                    ids.add(right);
                    map.put(s.charAt(right), ids);
                    right++;
                } else {
                    break;
                }
            }
            maxLen = Math.max(maxLen, right - i);

            List<Integer> ids = map.get(s.charAt(i));
            if (ids.size() == 1) {
                map.remove(s.charAt(i));
            } else {
                ids.remove(0);
            }
        }

        return maxLen;
    }
}
