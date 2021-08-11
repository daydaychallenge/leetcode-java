package daydaychange.p00838;

/**
 * https://leetcode.com/problems/push-dominoes/
 * Push Dominoes
 * There are n dominoes in a line, and we place each domino vertically upright. In the beginning, we simultaneously push some of the dominoes either to the left or to the right.
 *
 * After each second, each domino that is falling to the left pushes the adjacent domino on the left. Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.
 *
 * When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.
 *
 * For the purposes of this question, we will consider that a falling domino expends no additional force to a falling or already fallen domino.
 *
 * You are given a string dominoes representing the initial state where:
 *
 * dominoes[i] = 'L', if the ith domino has been pushed to the left,
 * dominoes[i] = 'R', if the ith domino has been pushed to the right, and
 * dominoes[i] = '.', if the ith domino has not been pushed.
 * Return a string representing the final state.
 *
 *
 *
 * Example 1:
 *
 * Input: dominoes = "RR.L"
 * Output: "RR.L"
 * Explanation: The first domino expends no additional force on the second domino.
 *
 * Input: dominoes = ".L.R...LR..L.."
 * Output: "LL.RR.LLRRLL.."
 *
 *
 * Constraints:
 *
 * n == dominoes.length
 * 1 <= n <= 105
 * dominoes[i] is either 'L', 'R', or '.'.
 *
 */
public class PushDominoes {

    public String pushDominoes(String dominoes) {
        if (dominoes == null || dominoes.length() == 0) return "";
        if (dominoes.length() == 1) return dominoes;
        dominoes = 'L' + dominoes + 'R';
        StringBuilder res = new StringBuilder();
        for (int i = 0, j = 1; j < dominoes.length(); ++j) {
            if (dominoes.charAt(j) == '.') continue;
            int middle = j - i - 1;
            if (i > 0)
                res.append(dominoes.charAt(i));
            if (dominoes.charAt(i) == dominoes.charAt(j))
                for (int k = 0; k < middle; k++)
                    res.append(dominoes.charAt(i));
            else if (dominoes.charAt(i) == 'L' && dominoes.charAt(j) == 'R')
                for (int k = 0; k < middle; k++)
                    res.append('.');
            else {
                for (int k = 0; k < middle / 2; k++)
                    res.append('R');
                if (middle % 2 == 1)
                    res.append('.');
                for (int k = 0; k < middle / 2; k++)
                    res.append('L');
            }
            i = j;
        }
        return res.toString();
    }


    public String pushDominoes1(String dominoes) {
        if (dominoes.length() == 0) {
            return dominoes;
        }
        int n = dominoes.length();
        char[] dos = new char[n + 2];
        System.arraycopy(dominoes.toCharArray(), 0, dos, 1, n);
        dos[0] = 'L';
        dos[n + 1] = 'R';

        int start = 0;
        char sdir;
        while (start <= n) {
            sdir = dos[start];
            int end = start + 1;
            while (dos[end] == '.') {
                end++;
            }
            char edir = dos[end];

            if (edir == 'R') {
                if (sdir == 'R') {
                    // falling right
                    for (; start < end; start++) {
                        dos[start] = 'R';
                    }
                } else {  // sdir == 'L'
                    // do nothing
                    start = end;
                }
            } else {  // edir == 'L'
                if (sdir == 'R') {
                    // falling opposite
                    int i = start, j = end;
                    while (i < j) {
                        dos[i++] = 'R';
                        dos[j--] = 'L';
                    }
                    start = end;
                } else {  // sdir == 'L'
                    // falling left
                    for (; start < end; start++) {
                        dos[start] = 'L';
                    }
                }
            }
        }
        return String.valueOf(dos).substring(1, n + 1);
    }

    public String pushDominoes2(String dominoes) {
        char[] a = dominoes.toCharArray();
        for (int i = 0, L = -1, R = -1; i <= dominoes.length(); i++)
            if (i == a.length || a[i] == 'R') {
                if (R > L)//R..R, turn all to R
                    while (R < i)
                        a[R++] = 'R';
                R = i;
            } else if (a[i] == 'L')
                if (L > R || R == -1)//L..L, turn all to L
                    while (++L < i)
                        a[L] = 'L';
                else { //R...L
                    L = i;
                    for (int lo = R + 1, hi = L - 1; lo < hi; ) {//one in the middle stays '.'
                        a[lo++] = 'R';
                        a[hi--] = 'L';
                    }
                }
        return new String(a);
    }



}
