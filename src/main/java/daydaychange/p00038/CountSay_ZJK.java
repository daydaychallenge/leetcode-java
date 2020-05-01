package daydaychange.p00038;

public class CountSay_ZJK {
    public String countAndSay(int n) {
        if (n == 0) return "";
        StringBuilder sb = new StringBuilder("1");
        while (n > 1) {
            int len = sb.length();
            String t = sb.toString();
            sb.setLength(0);
            for (int i = 0; i < len; i++) {
                int count = 1;
                while (i < len - 1 && t.charAt(i) == t.charAt(i + 1)) {
                    i ++;
                    count ++;
                }
                sb.append(count).append(t.charAt(i));
            }
            n --;
        }
        return sb.toString();
    }
}
