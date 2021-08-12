package daydaychange.p01624;

/**
 * https://leetcode.com/problems/largest-substring-between-two-equal-characters/
 * 1624. Largest Substring Between Two Equal Characters
 * Given a string s, return the length of the longest substring between two equal characters, excluding the two characters.
 * If there is no such substring return -1.
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 * Example 1:
 *
 * Input: s = "aa"
 * Output: 0
 * Explanation: The optimal substring here is an empty substring between the two 'a's.
 * Example 2:
 *
 * Input: s = "abca"
 * Output: 2
 * Explanation: The optimal substring here is "bc".
 * Example 3:
 *
 * Input: s = "cbzxy"
 * Output: -1
 * Explanation: There are no characters that appear twice in s.
 * Example 4:
 *
 * Input: s = "cabbac"
 * Output: 4
 * Explanation: The optimal substring here is "abba". Other non-optimal substrings include "bb" and "".
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 300
 * s contains only lowercase English letters.
 */
public class LargestSubstringBetweenTwoEqualCharacters {

    int[] letters = new int[26];

    public static void main(String[] args) {
        LargestSubstringBetweenTwoEqualCharacters l = new LargestSubstringBetweenTwoEqualCharacters();

        int max = l.maxLengthBetweenEqualCharacters("cabbac");
        System.out.println(max);
    }

    public int maxLengthBetweenEqualCharacters(String s) {
        if (s == null || s.isEmpty()) return 0;
        int len = s.length();
        int max = -1;
        for (int i = 0; i < len; i ++) {
            int c = s.charAt(i) - 'a';
            int index = letters[c];
            if (index > 0) {
                int l = i - index;
                max = Math.max(l, max);
            } else {
                letters[c] = i + 1;
            }
        }
        return max;
    }
}
