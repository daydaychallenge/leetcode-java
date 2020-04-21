package daydaychange.p00647;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-21 11:11
 */
public class PalindromicSubstrings_ZJK {
    public int countSubstrings(String s) {
        int ans = 0;
        int start = 0;
        char[] data = s.toCharArray();
        int len = data.length;
        while(start < len) {
            int left = start - 1;
            int right = start;
            // 把right下标右+1
            while(right < len && data[right] == data[start]) {
                right++;
            }
            int basic = right - start;
            // 相同元素， 共有多少个。
            ans += (1 + basic) * basic / 2;
            // 以start为中心， 往外找回文字符
            while(left >= 0 && right < len && data[left] == data[right]) {
                ans++;
                left--;
                right++;
            }
            // 指定下一开始位置
            start += basic;
        }
        return ans;
    }
}
