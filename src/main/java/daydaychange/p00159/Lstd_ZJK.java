package daydaychange.p00159;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/6 5:35 PM
 */
public class Lstd_ZJK {

    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s == null) return -1;
        if (s.isEmpty()) return 0;
        int maxLen = 0;
        int slow = 0, fast = 1;
        boolean reset = false;
        int secondIndex = 0;
        while (fast < s.length()) {
            if (!reset) {
                if (s.charAt(slow) != s.charAt(fast)) {
                    reset = true;
                    secondIndex = fast;
                }
            } else {
                // 需要与second和fast比较
                if (s.charAt(secondIndex) != s.charAt(fast) && s.charAt(fast) != s.charAt(slow)) {
                    maxLen = Math.max(fast - slow, maxLen);
                    int t = fast - 1;
                    // 往前找第一个与前前一个不相等的字符
                    while (t > slow && s.charAt(fast - 1) == s.charAt(t - 1)) t --;
                    slow = t;
                    secondIndex = fast;
                }
            }
            fast ++;
        }
        maxLen = Math.max(maxLen, fast - slow);
        return maxLen;
    }
}
