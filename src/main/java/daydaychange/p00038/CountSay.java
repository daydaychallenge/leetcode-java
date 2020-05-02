package daydaychange.p00038;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/3 6:42 AM
 */
public class CountSay {

    /**
     * 我是从别人的答案才理解这题目的题意
     */
    public String countAndSay(int n) {
        if (n == 1) return "1";

        return say(countAndSay(n - 1));
    }

    private String say(String s) {
        char cur = s.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == cur) {
                count++;
            } else {
                sb.append(count);
                sb.append(cur);

                cur = s.charAt(i);
                count = 1;
            }
        }

        sb.append(count);
        sb.append(cur);

        return sb.toString();
    }
}
