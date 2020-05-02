package daydaychange.p00443;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/2 7:34 AM
 */
public class StringCompression {

    public int compress(char[] chars) {
        if (chars == null) return 0;
        if (chars.length <= 1) return chars.length;

        int lastChar = chars[0], lastPos = 0, count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == lastChar) {
                //相同的字符数目
                count++;
            } else {
                if (count > 1) {
                    lastPos++;
                    char[] nums = covertToChars(count);
                    for (int j = 0; j < nums.length; j++) {
                        chars[lastPos++] = nums[j];
                    }
                }

                if (count == 1) {
                    lastPos++;
                }
                lastChar = chars[i];
                count = 1;
                chars[lastPos] = chars[i];
            }
        }

        if (count > 1) {
            lastPos++;
            char[] nums = covertToChars(count);
            for (int j = 0; j < nums.length; j++) {
                chars[lastPos++] = nums[j];
            }
        }

        return lastPos;
    }

    private char[] covertToChars(int num) {
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(num % 10);
            num = num / 10;
        }

        return sb.reverse().toString().toCharArray();
    }

}
