package daydaychange.p01003;

/**
 * @author ZhangJiangke
 * @version 1.0
 * @date 2020/4/12 12:35 PM
 */
public class ValidAbcString_ZJK {

    public boolean isValid(String s) {
        if (s == null || s.length() < 3 || s.length() == 4 || s.length() == 5) return false;
        char[] chars = s.toCharArray();
        if (chars[0] != 'a' || chars[chars.length - 1] != 'c') return false;
        char[] expectChars = new char[s.length()];
        int index = 0;
        for (int i = 1, len = chars.length; i < len; i++) {
            char preChar = chars[i - 1];
            char curChar = chars[i];
            int diff = curChar - preChar;
            if (diff == 1 || diff == -2) continue;
            else if (diff == 2) return false;
            else if (diff == -1 || diff == 0) {
                if (index == 0) {
                    expectChars[index++] = (char) (preChar + 1);
                } else {
                    char expectChar = expectChars[index - 1];
                    if (expectChar == curChar) {
                        index --;
                    } else {
                        expectChars[index++] = (char) (preChar + 1);
                    }
                }
            }
        }
        return index == 0;
    }

}
