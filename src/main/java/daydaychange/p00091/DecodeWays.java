package daydaychange.p00091;

public class DecodeWays {

    public int numDecodings(String s) {
        if (s == null || s.length() == 0) return 0;
        char[] chars = s.toCharArray();
        if (chars[0] == '0') return 0;
        int r1 = 1, r2 = 1;
        for (int i = 1; i < s.length(); i++) {
            char curr = chars[i];
            char pre = chars[i - 1];
            if (curr == '0') r1 = 0;
            if (pre == '1' || pre == '2' && curr < '7') {
                r1 = r1 + r2;
                r2 = r1 - r2;
            } else r2 = r1;
        }
        return r1;
    }

    public int numDecodings0MS(String s) {
        int oneBack = 1;
        int twoBack = 1;
        if (s == null || s.length() == 0) return 0;
        if (s.charAt(0) == '0') return 0;

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            int currSum = 0;
            int d = ch - '0';
            if (d != 0) {
                currSum = oneBack;
            }
            int dd = (s.charAt(i - 1) - '0') * 10 + d;
            if (dd >= 10 && dd <= 26) {
                currSum += twoBack;
            }
            twoBack = oneBack;
            oneBack = currSum;
        }
        return oneBack;
    }

}
