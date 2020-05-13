package daydaychange.p00010;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/11 2:00 PM
 */
public class RegularExpressionMatching {

    /**
     * @param s
     * @param p '.' Matches any single character.
     *          '*' Matches zero or more of the preceding element.
     * @return
     */
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();

        boolean firstMatched = (!s.isEmpty() &&
                (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));

        if (p.length() >= 2 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) ||
                    (firstMatched && isMatch(s.substring(1), p));
        } else {
            return firstMatched && isMatch(s.substring(1), p.substring(1));
        }
    }

    /**
     *
     */
    enum Result {
        TRUE, FALSE;
    }

    Result[][] memo;

    public boolean isMatchDp(String s, String p) {
        int m = s.length(), n = p.length();
        memo = new Result[m + 1][n + 1];

        return dpMatch(0, 0, s, p);
    }

    private boolean dpMatch(int si, int pj, String s, String p) {
        if (memo[si][pj] != null) {
            return memo[si][pj] == Result.TRUE;
        }
        boolean ans = false;
        if (pj == p.length()) {
            ans = si == s.length();
        } else {
            boolean curMatched = (si < s.length() &&
                    (s.charAt(si) == p.charAt(pj) || p.charAt(pj) == '.'));

            if (pj + 1 < p.length() && p.charAt(pj + 1) == '*') {
                ans = dpMatch(si, pj + 2, s, p) ||
                        (curMatched && dpMatch(si + 1, pj, s, p));
            } else {
                ans = dpMatch(si + 1, pj + 1, s, p);
            }
        }

        memo[si][pj] = ans ? Result.TRUE : Result.FALSE;
        return ans;
    }

}
