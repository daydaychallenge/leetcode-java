package daydaychange.p01108;

public class DefangingIPAddress_ZJK {

    public String defangIPaddr(String address) {
        if (address == null || address.isEmpty()) return "";
        int low = 0, leftIndex = 0, hi = address.length() - 1, rightIndex = address.length() + 5;
        char[] ret = new char[address.length() + 6];
        while (low <= hi) {
            char l = address.charAt(low);
            char r = address.charAt(hi);
            if (l == '.') {
                ret[leftIndex++] = '[';
                ret[leftIndex++] = l;
                ret[leftIndex++] = ']';
            } else {
                ret[leftIndex++] = l;
            }
            if (low != hi) {
                if (r == '.') {
                    ret[rightIndex--] = ']';
                    ret[rightIndex--] = r;
                    ret[rightIndex--] = '[';
                } else {
                    ret[rightIndex--] = r;
                }
            }
            low ++;
            hi --;
        }
        return new String(ret);
    }

}
