package daydaychange.p00161;

/**
 * @auth: Zhangjk
 * @Date: 2020/5/11 5:50 下午
 */
public class OneEditDistance_ZJK {

    public boolean isOneEditDistance(String s, String t) {
        if (s == null && t == null) return true;
        else if ((s == null && t != null) || (s != null && t == null)) return false;
        int len1 = s.length(), len2 = t.length();
        if (len1 == 0 && len2 == 0) return false;
        if (Math.abs(len1 - len2) > 1) return false;

        if (len1 == 1 && len2 == 0) return true;
        if (len1 == 0 && len2 == 1) return true;

        int index = 0;
        int i = 0, j = 0;
        while (i < len1 && j < len2) {
            char c1 = s.charAt(i), c2 = t.charAt(j);
            if (c1 == c2) {
                i ++;
                j ++;
            } else if (index > 0){
                return false;
            } else {
                index ++;
                if (len1 == len2) {
                    i ++;
                    j ++;
                } else if (len1 < len2) {
                    j ++;
                } else i ++;
            }
        }
        if (index == 0) {
            if (i < len1 || j < len2) {
                return true;
            } else return false;
        }
        return true;
    }

}
