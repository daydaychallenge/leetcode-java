package daydaychange.p00006;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/13 1:19 PM
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if (s == null || s.length() <= 1) return s;
        if (numRows <= 1) return s;

        StringBuilder res = new StringBuilder();
        int z = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < s.length(); ) {
                res.append(s.charAt(i + j));
                // 第一行最后一行需要特殊处理
                if (i != 0 && i != (numRows - 1) && (j + z - i) < s.length()) {
                    res.append(s.charAt(j + z - i));
                }
                j = j + z;
            }
        }

        return res.toString();
    }

}
