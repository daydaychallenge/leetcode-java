package daydaychange.p00336;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auth: garbage_y
 * @Date: 2020/5/8 5:31 下午
 */
public class PalindromePairs_ZJK {

    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> ans = new ArrayList<>();
        if (words == null || words.length == 0 || words.length == 1) {
            return ans;
        }
        for (int i = 0; i < words.length; i ++) {
            for (int j = 0; j < words.length; j ++) {
                if (i == j) continue;
                String s = words[i] + words[j];
                if (isPalindrome(s)) {
                    List<Integer> a = Arrays.asList(i, j);
                    ans.add(a);
                }
            }
        }
        return ans;
    }

    private boolean isPalindrome(String s) {
        int lo = 0, hi = s.length() - 1;
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) return false;
            lo ++;
            hi --;
        }
        return true;
    }

}
