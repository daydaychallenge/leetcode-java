package daydaychange.p00647;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/20 1:45 PM
 */
public class PalindromicSubstrings {

    /**
     * 时间复杂度O(n^3)
     */
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;
            for (int j = i + 1; j < s.length(); j++) {
                if (isPalindromic(s, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPalindromic(String s, int start, int end) {
        int l = start, r = end;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
