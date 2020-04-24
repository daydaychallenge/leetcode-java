package daydaychange.p00043;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-24 15:39
 */
public class MultiplyStrings_ZJK {

    public String multiply(String num1, String num2) {
        if (num1 == null || num1.isEmpty() || num1.equals("0")) return "0";
        if (num2 == null || num2.isEmpty() || num2.equals("0")) return "0";
        if (num1.equals("1")) return num2;
        if (num2.equals("1")) return num1;
        int len1 = num1.length();
        int len2 = num2.length();
        int resultLen = len1 + len2;
        int[] result = new int[resultLen];
        for (int i = len1 - 1, k = 1; i >= 0; i --, k++) {
            int m = num1.charAt(i) - '0';
            int index = resultLen - k;
            for (int j = len2 - 1; j >= 0; j --) {
                int n = num2.charAt(j) - '0';
                int d = result[index];
                int r = m * n + d;
                result[index] = r % 10;
                result[index - 1] += r / 10;
                index --;
            }
        }
        int start = result[0] == 0 ? 1 : 0;
        StringBuilder sb = new StringBuilder();
        for (;start < resultLen; start ++) {
            sb.append(result[start]);
        }
        return sb.toString();
    }
}
