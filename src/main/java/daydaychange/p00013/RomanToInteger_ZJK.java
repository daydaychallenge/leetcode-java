package daydaychange.p00013;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-13 12:59
 */
public class RomanToInteger_ZJK {

    public int romanToInt(String s) {
        if (s == null || s.isEmpty()) return 0;
        int ans = 0;
        char[] chars = s.toCharArray();
        char first = chars[0];
        ans = getNum(first);
        for (int i = 1, size = chars.length; i < size; i++) {
            char c = chars[i];
            char preChar = chars[i - 1];
            ans += getNum(preChar, c);
        }
        return ans;
    }

    private int getNum(char pre, char cur) {
        if (pre == 'I' && cur == 'V') return 4 - 1;
        else if (pre == 'I' && cur == 'X') return 9 - 1;
        else if (pre == 'X' && cur == 'L') return 40 - 10;
        else if (pre == 'X' && cur == 'C') return 90 - 10;
        else if (pre == 'C' && cur == 'D') return 400 - 100;
        else if (pre == 'C' && cur == 'M') return 900 - 100;
        else return getNum(cur);
    }

    private int getNum(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:return 0;
        }
    }

}
