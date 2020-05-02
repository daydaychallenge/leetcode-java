package daydaychange.p00014;

public class LongestCommonPrefix_ZJK {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        int low = 0, hi = strs.length - 1;
        StringBuilder sb = new StringBuilder();
        while (low <= hi) {
            String first = strs[low];
            String end = strs[hi];
            int len = find(first, end, sb.toString());
            if (len == 0) return "";
            if (sb.length() == 0) {
                sb.append(first.substring(0, len));
            } else sb.setLength(len);
            low ++;
            hi --;
        }
        return sb.toString();
    }

    public int find(String first, String end, String common) {
        int len1 = first.length(), len2 = end.length();
        int len3 = common.length();
        int i = 0;
        for (; i < len1 && i < len2; i ++) {
            if (first.charAt(i) != end.charAt(i)) {
                break;
            } else if (i < len3 && first.charAt(i) != common.charAt(i)) {
                break;
            } else if (len3 != 0 && i >= len3) {
                return len3;
            }
        }

        return i;
    }

}
