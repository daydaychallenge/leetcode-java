package daydaychange.p00266;

import java.util.HashSet;
import java.util.Set;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/23 3:22 PM
 */
public class PalindromePermutation {

    public boolean canPermutePalindrome(String s) {
        if (s == null || s.length() == 0) return true;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }

        return set.isEmpty() || set.size() == 1;
    }
}
