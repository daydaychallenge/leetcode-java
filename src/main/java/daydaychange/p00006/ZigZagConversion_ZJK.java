package daydaychange.p00006;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-13 14:23
 */
public class ZigZagConversion_ZJK {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        if (s == null || s.isEmpty()) return "";
        int stepLen = 2 * (numRows - 1);
        int len = s.length();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < numRows; i ++) {
            int cycle = 0;
            int index = 0;
            while ((index = i + cycle * stepLen) < len) {
                sb.append(s.charAt(index));
                if (i != 0 && i != numRows - 1) {
                    int innerIndex = stepLen * (cycle + 1) - i;
                    if (innerIndex < len) sb.append(s.charAt(innerIndex));
                }
                cycle ++;
            }
        }
        return sb.toString();
    }
}
