package daydaychange.p00443;

public class StringCompression_ZJK {

    public int compress(char[] chars) {
        if (chars == null || chars.length == 0) return 0;
        if (chars.length == 1) return 1;
        int count = 1;
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count ++;
                i ++;
            }
            chars[index ++] = chars[i];
            if (count != 1) {
                int t = count / 1000;
                if (t != 0) chars[index ++] = (char)(t + '0');
                int h = (count / 100) % 10;
                if (h != 0) chars[index ++] = (char)(h + '0'); else if (t != 0) {
                    chars[index ++] = '0';
                }
                int d = (count / 10) % 10;
                if (d != 0) chars[index ++] = (char)(d + '0'); else if (t != 0 || h != 0) {
                    chars[index ++] = '0';
                }
                int digit = count % 10;
                if (digit != 0) chars[index ++] = (char)(digit + '0'); else if (t != 0 || h != 0 || d != 0) {
                    chars[index ++] = '0';
                }
                count = 1;
            }
        }
        return index;
    }

}
