package daydaychange.p00014;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/4 7:53 AM
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        String firstStr = strs[0];
        int end = 0;
        for (int i = 0; i < firstStr.length(); i++) {
            boolean allContained = true;
            end++;
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != firstStr.charAt(i)) {
                    allContained = false;
                    end--;
                    break;
                }
            }
            if (!allContained) {
                break;
            }
        }

        return end == 0 ? "" : firstStr.substring(0, end);
    }
}
