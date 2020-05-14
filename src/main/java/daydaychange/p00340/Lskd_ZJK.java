package daydaychange.p00340;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/6 7:03 PM
 */
public class Lskd_ZJK {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int n = s.length();
        if (n * k == 0) return 0;

        int maxLen = 1;

        int[] characters = new int[256];

        int left = 0, right = 0, len = s.length(), marked = k;

        while (right < len) {
            int c = s.charAt(right);
            int old = characters[c];
            if (right == 0) {
                marked--;
            } else {
                if (old == 0 && marked == 0) {
                    maxLen = Math.max(maxLen, right - left);
                    // remove the character from left, when encounter an character count become zero,
                    // here is the new left;
                    while (left < right) {
                        int leftV = s.charAt(left);
                        int count = characters[leftV]--;
                        left++;
                        if (count == 1) {
                            // marked + 1;
                            break;
                        }
                    }
                } else if (old == 0) {
                    // plus one to the character, if the character is zero, minus marked.
                    marked--;
                }
            }
            characters[c]++;
            right++;
        }
        return Math.max(maxLen, right - left);
    }
}
