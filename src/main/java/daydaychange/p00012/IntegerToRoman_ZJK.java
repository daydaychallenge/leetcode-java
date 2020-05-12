package daydaychange.p00012;

/**
 * @author ZhangJk
 * @version 1.0
 * @date 2020/5/6 5:06 PM
 */
public class IntegerToRoman_ZJK {

    public String intToRoman(int num) {
        if (num <= 0) throw new IllegalArgumentException("num must be greater than zero");
        StringBuilder sb = new StringBuilder();

        int t = num / 1000;
        append(sb, t, "M");
        num = num % 1000;
        if (num >= 900) {
            sb.append("CM");
            num -= 900;
        }
        if (num >= 500) {
            int h = (num - 500) / 100;
            sb.append("D");
            append(sb, h, "C");
            num %= 100;
        }
        if (num >= 400) {
            sb.append("CD");
            num -= 400;
        }
        if (num >= 100) {
            int h = num / 100;
            append(sb, h, "C");
            num %= 100;
        }
        if (num >= 90) {
            sb.append("XC");
            num -= 90;
        }
        if (num >= 50) {
            sb.append("L");
            int h = (num - 50) / 10;
            append(sb, h, "X");
            num %= 10;
        }
        if (num >= 40) {
            sb.append("XL");
            num -= 40;
        }
        if (num >= 10) {
            int h = num / 10;
            append(sb, h, "X");
            num %= 10;
        }
        if (num >= 9) {
            sb.append("IX");
            num -= 9;
        } else if (num >= 5) {
            sb.append("V");
            append(sb, num - 5, "I");
            num = 0;
        }
        if (num == 4) sb.append("IV");
        else {
            append(sb, num, "I");
        }
        return sb.toString();
    }

    private void append(StringBuilder sb, int count, String s) {
        for (int i = 0; i < count; i++) {
            sb.append(s);
        }
    }

}
