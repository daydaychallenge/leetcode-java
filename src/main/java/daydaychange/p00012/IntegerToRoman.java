package daydaychange.p00012;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/6 5:06 PM
 */
public class IntegerToRoman {

    public String intToRoman(int num) {
        if (num <= 0) throw new IllegalArgumentException("num must be greater than zero");

        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            int sub = 0;
            if (num >= 1000) {
                sub = 1000;
                sb.append("M");
            } else if (num < 1000 && num >= 900) {
                sub = 900;
                sb.append("CM");
            } else if (num < 900 && num >= 500) {
                sub = 500;
                sb.append("D");
            } else if (num < 500 && num >= 400) {
                sub = 400;
                sb.append("CD");
            } else if (num < 400 && num >= 100) {
                sub = 100;
                sb.append("C");
            } else if (num < 100 && num >= 90) {
                sub = 90;
                sb.append("XC");
            } else if (num < 90 && num >= 50) {
                sub = 50;
                sb.append("L");
            } else if (num < 50 && num >= 40) {
                sub = 40;
                sb.append("XL");
            } else if (num < 40 && num >= 10) {
                sub = 10;
                sb.append("X");
            } else if (num < 10 && num >= 9) {
                sub = 9;
                sb.append("IX");
            } else if (num < 9 && num >= 5) {
                sub = 5;
                sb.append("V");
            } else if (num < 5 && num >= 4) {
                sub = 4;
                sb.append("IV");
            } else {
                sub = 1;
                sb.append("I");
            }

            num -= sub;
        }
        return sb.toString();
    }

}
