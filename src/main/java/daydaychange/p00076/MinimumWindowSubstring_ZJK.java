package daydaychange.p00076;

/**
 * @auth: Zhangjk
 * @Date: 2020/5/20 6:13 下午
 */
public class MinimumWindowSubstring_ZJK {

    public String minWindow(String s, String t) {

        if (s == null || s.isEmpty()) return "";
        if (t == null || t.isEmpty()) return "";

        int[] tCharCount = new int[256];
        for (char c : t.toCharArray()) {
            tCharCount[c] ++;
        }

        int left = 0, right = 0, count = t.length();

        int start = 0, len = Integer.MAX_VALUE ;

        while (right < s.length()) {
            char c = s.charAt(right);
            tCharCount[c]--;
            if (tCharCount[c] >= 0) {
                count --;
            }
            while (count == 0) {
                if (right - left < len) {
                    start = left;
                    len = right - left + 1;
                }
                char l = s.charAt(left);
                tCharCount[l] ++;
                left ++;
                if (tCharCount[l] > 0) {
                    count ++;
                }
            }
            right ++;
        }
        if (len == Integer.MAX_VALUE) return "";
        return s.substring(start, start + len);
    }

}
