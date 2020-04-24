package daydaychange.p00043;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/24 9:24 PM
 */
public class MultiplyStrings {

    /**
     * 参考
     * https://leetcode-cn.com/problems/multiply-strings/solution/lao-lao-shi-shi-de-shu-cheng-mo-ni-by-spark-young/
     *
     * @param num1
     * @param num2
     * @return
     */
    public String multiply(String num1, String num2) {
        //代码可以处理0和1的，在这里加上判别是希望提高一下效率
        //用0或1去乘以110位的数字感觉好浪费啊
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        if (num1.equals("1"))
            return num2;
        if (num2.equals("1"))
            return num1;

        char[] leftChars = num1.toCharArray();
        char[] rightChars = num2.toCharArray();

        char[] res = new char[leftChars.length + rightChars.length];
        // 初始化
        for (int i = 0; i < res.length; i++) {
            res[i] = '0';
        }
        for (int i = rightChars.length - 1; i >= 0; i--) {
            multiply(leftChars, rightChars[i], res.length - rightChars.length + i, res);
        }

        // 去掉开头的0，因为有些乘出来长度可能小于两数位数之和
        int offset = 0;
        for (int i = 0; i < res.length && res[i] == '0'; i++) {
            offset++;
        }
        return String.valueOf(res, offset, res.length - offset);
    }

    /**
     * @param leftChars 被乘数
     * @param right
     * @param index     结果的最低位
     * @param res       结果
     */
    private void multiply(char[] leftChars, char right, int index, char[] res) {
        for (int i = leftChars.length - 1; i >= 0; i--) {
            int j = leftChars.length - 1 - i;

            int tmp = (leftChars[i] - '0') * (right - '0');
            // 将乘积的个位与结果当前位相加
            int add = (res[index - j] - '0') + tmp % 10;
            // 和的个位放入当前位
            res[index - j] = (char) (add % 10 + '0');
            // 和的十位作为进位，只会进位一次嘛
            res[index - j - 1] += tmp / 10 + add / 10;
        }

    }

}
