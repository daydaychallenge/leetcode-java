package daydaychange.p00058;

/**
 * @auth: Zhangjk
 * @Date: 2020/5/18 10:01 上午
 */
public class LastWordLength_ZJK {

    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) return 0;
        int index = s.length() - 1;
        int len = 0;
        while (index >= 0) {
            while (index >= 0 && s.charAt(index) == ' ') index --;
            int right = index;
            while (index >= 0 && s.charAt(index) != ' ') index --;
            len = right - index;
            break;
        }
        return len;
    }

}
