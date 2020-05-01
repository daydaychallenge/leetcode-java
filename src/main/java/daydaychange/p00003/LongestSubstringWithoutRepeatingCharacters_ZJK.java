package daydaychange.p00003;

public class LongestSubstringWithoutRepeatingCharacters_ZJK {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        int[] visited = new int[256];
        int ans = 1;
        int slow = 0, fast = 0;
        for (; fast < s.length(); fast ++) {
            char c = s.charAt(fast);
            if (visited[c] == 0) {
                visited[c] = 1;
            } else {
                ans = Math.max(ans, fast - slow);
                while (slow < fast && s.charAt(slow) != s.charAt(fast)) {
                    visited[s.charAt(slow)] = 0;
                    slow ++;
                }
                slow ++;
            }
        }
        return Math.max(ans, fast - slow);
    }
}
