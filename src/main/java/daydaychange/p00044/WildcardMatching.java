package daydaychange.p00044;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/13 4:33 PM
 */
public class WildcardMatching {

    private boolean matched = false;

    public boolean isMatch(String s, String p) {
        matched = false;

        recurMatch(s, removeConsStars(p));

        return matched;
    }

    private void recurMatch(String s, String p) {
        // 递归终止条件
        if (p.isEmpty() || matched) {
            if (s.isEmpty()) matched = true;
            return;
        }

        if (p.charAt(0) == '?') {
            // ? 可匹配任意单个字符
            if (!s.isEmpty()) {
                recurMatch(s.substring(1), p.substring(1));
            }
        } else if (p.charAt(0) == '*') {
            // * 匹配任意字符序列包括空序列
            recurMatch(s, p.substring(1));
            if (!s.isEmpty()) {
                recurMatch(s.substring(1), p);
            }
        } else {
            // 首字符比较 递归匹配余下字符串
            if (!s.isEmpty() && s.charAt(0) == p.charAt(0)) {
                recurMatch(s.substring(1), p.substring(1));
            }
        }
    }

    private String removeConsStars(String p) {
        if (p.isEmpty()) {
            return p;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(p.charAt(0));
        for (int i = 1; i < p.length(); i++) {
            if (p.charAt(i) == '*' && p.charAt(i - 1) == '*') {

            } else {
                sb.append(p.charAt(i));
            }
        }

        return sb.toString();
    }
}
