package daydaychange.p00028;

public class StrStrImplement_ZJK {
    public int strStr(String haystack, String needle) {

        if (haystack == null || haystack.isEmpty()) {
            if (!needle.isEmpty()) return -1;
            else return 0;
        }
        if (needle == null || needle.isEmpty()) return 0;
        int len1 = haystack.length(), len2 = needle.length();
        if (len1 < len2) return -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i ++) {
            int end = i + len2 - 1;
            int start = i;
            while (start <= end && haystack.charAt(start) == needle.charAt(start - i)
                    && haystack.charAt(end) == needle.charAt(len2 - start + i - 1)) {
                start ++;
                end --;
            }
            if (start > end) return i;
        }
        return -1;
    }
}
