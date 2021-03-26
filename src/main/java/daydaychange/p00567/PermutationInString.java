package daydaychange.p00567;

public class PermutationInString {

    public static void main(String[] args) {
        PermutationInString s = new PermutationInString();
        boolean b = s.checkInclusion("adc", "dcda");
        System.out.println(b);
    }

    public boolean checkInclusion1(String s1, String s2) {

        int[] count = new int[128];
        for (int i = 0; i < s1.length(); i ++) {
            count[s1.charAt(i)]--;
        }
        for (int l = 0, r = 0; r < s2.length(); r ++) {
            if (++count[s2.charAt(r)] > 0) {
                // 需要减掉这个字符
                while (--count[s2.charAt(l++)] != 0) {/* do nothing */}
            } else if ((r - l + 1) == s1.length()) return true;
        }
        return s1.length() == 0;
    }

    public boolean checkInclusion(String s1, String s2) {
        return helper(s1.toCharArray(), s2.toCharArray(), 0);
    }

    public boolean helper(char[] chars, char[] chars2, int start) {
        if (start >= chars.length) {
            return checkSubstring(chars, chars2);
        } else {
            for (int i=start; i<chars.length; i++) {
                swap(chars, start, i);
                boolean r = helper(chars, chars2, start+1);
                if (r) return true;
                swap(chars, start, i);
            }
        }
        return false;
    }

    private void swap(char[] chars, int i1, int i2) {
        char tmp = chars[i1];
        chars[i1] = chars[i2];
        chars[i2] = tmp;
    }

    public boolean checkSubstring(char[] chars1, char[] chars2) {
         for (int i = 0; i < chars2.length - chars1.length + 1; i ++) {
            char c = chars2[i];
            if (c == chars1[0]) {
                boolean flag = true;
                for (int j = 1, k = i + chars1.length - 1; j < chars1.length; j ++, k --) {
                    if (chars1[j] == chars2[i + j] && chars1[chars1.length - j] == chars2[k]) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (flag) return true;
            }
        }
        return false;
    }

}
