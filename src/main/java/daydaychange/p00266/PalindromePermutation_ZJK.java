package daydaychange.p00266;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-23 10:18
 */
public class PalindromePermutation_ZJK {
    public boolean canPermutePalindrome(String s) {
        int[] letters = new int[128];
        int lo = 0, hi = s.length() - 1;
        char[] data = s.toCharArray();
        while (lo <= hi) {
            int l = data[lo];
            int h = data[hi];
            if (lo != hi) letters[h] += 1;
            letters[l] += 1;
            lo ++;
            hi --;
        }

        int flag = 0;

        for (int i = 0; i < 128; i++) {
            int c = letters[i];
            if (c % 2 != 0) flag ++;
        }
        return flag < 2;
    }

}
