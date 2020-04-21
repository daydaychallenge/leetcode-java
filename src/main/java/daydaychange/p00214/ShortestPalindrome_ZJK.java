package daydaychange.p00214;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-21 11:48
 */
public class ShortestPalindrome_ZJK {

    public String shortestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";
        int len = s.length();
        char[] data = s.toCharArray();
        int i = len - 1;
        while (i >= 0) {
            int left = 0;
            int right = i;
            while (left < i && data[left] == data[right]) {
                left ++;
                right --;
            }
            if (left == i) {
                break;
            } else i --;
        }
        StringBuilder sb = new StringBuilder();
        for (int j = len - 1; j > i; j --) {
            sb.append(data[j]);
        }
        sb.append(data);
        return sb.toString();
    }

}
