package daydaychange.p00139;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<Integer> unbreakable = new HashSet<>();
        return helper(s, new HashSet<>(wordDict), 0, unbreakable);
    }


    public boolean wordBreakDp(String s, List<String> wordDict) {

        if (s.length() == 0) return false;
        Set<String> wdSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i <= s.length(); i ++) {
            for (int j = 0; j < i; j ++) {
                if (dp[j] && wdSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }

        }
        return dp[s.length()];
    }

    private boolean helper(String s, Set<String> dict, int start, Set<Integer> unbreakable) {

        if (start == s.length()) return true;
        for (int i = start + 1; i <= s.length(); i ++) {
            if (unbreakable.contains(i)) continue;
            if (dict.contains(s.substring(start, i))) {
                if (helper(s, dict, i, unbreakable)) return true;
                unbreakable.add(i);
            }
        }
        return false;
    }

}
