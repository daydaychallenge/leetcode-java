package daydaychange.p01544;

/**
 * https://leetcode.com/problems/make-the-string-great/
 * 1544. Make The String Great
 * Given a string s of lower and upper case English letters.
 *
 * A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:
 *
 * 0 <= i <= s.length - 2
 * s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
 * To make the string good, you can choose two adjacent characters that make the string bad and remove them.
 * You can keep doing this until the string becomes good.
 *
 * Return the string after making it good. The answer is guaranteed to be unique under the given constraints.
 *
 * Notice that an empty string is also good.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leEeetcode"
 * Output: "leetcode"
 * Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
 * Example 2:
 *
 * Input: s = "abBAcC"
 * Output: ""
 * Explanation: We have many possible scenarios, and all lead to the same answer. For example:
 * "abBAcC" --> "aAcC" --> "cC" --> ""
 * "abBAcC" --> "abBA" --> "aA" --> ""
 * Example 3:
 *
 * Input: s = "s"
 * Output: "s"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 100
 * s contains only lower and upper case English letters.
 */
public class MakeTheStringGreat {

    public static void main(String[] args) {
        MakeTheStringGreat t = new MakeTheStringGreat();
        String s = t.makeGood("abBAcC");
        System.out.println(s);
    }

    public String makeGood(String s) {
        if (s == null || s.length() == 0) return "";
        int len = s.length();
        char[] goodChars = new char[len];
        int index = 0;
        for (int i = 0; i < len; ) {
            char c = s.charAt(i);
            if (index > 0) {
                char goodC = goodChars[index - 1];
                if (Math.abs(goodC - c) == 32) {
                    index --;
                    i += 1;
                    continue;
                }
            }
            if (i + 1 >= len) {
                goodChars[index ++] = c;
                break;
            }
            char nextC = s.charAt(i + 1);
            if (Math.abs(c - nextC) == 32) {
                // remove
                i += 2;
                continue;
            }
            i++;
            goodChars[index ++] = c;
        }
        return new String(goodChars, 0, index);
    }

}
