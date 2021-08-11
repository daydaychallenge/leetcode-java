package daydaychange.p00131;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        helper(s, ans, new ArrayList<>(), 0);
        return ans;
    }

    private void helper(String s, List<List<String>> ans, List<String> res, int start) {
        if (start >= s.length()) {
            ans.add(new ArrayList<>(res));
        }
        for (int end = start; end < s.length(); end ++) {
            if (isPalindrome(start, end, s)) {
                res.add(s.substring(start, end + 1));
                helper(s, ans, res, end + 1);
                res.remove(res.size() - 1);
            }
        }
    }

    private boolean isPalindrome(int start, int end, String s) {
        if (start == end) return true;
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start ++;
                end --;
            } else {
                return false;
            }
        }
        return true;
    }

}
