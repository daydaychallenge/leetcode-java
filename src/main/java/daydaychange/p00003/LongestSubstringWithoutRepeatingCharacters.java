package daydaychange.p00003;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/3 7:21 AM
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0, left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }

            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }

        return max;
    }

    public int lengthOfLongestSubstringV2(String s) {
        if (s == null || s.length() == 0) return 0;

        // 哈希集合，记录每个字符是否出现过
        Set<Character> set = new HashSet<>();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int right = -1, maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            // i 代表左指针
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                set.remove(s.charAt(i - 1));
            }

            while (right + 1 < s.length() && !set.contains(s.charAt(right + 1))) {
                // 不断地移动右指针
                set.add(s.charAt(right + 1));
                right++;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            maxLen = Math.max(maxLen, right - i + 1);
        }

        return maxLen;
    }

}
