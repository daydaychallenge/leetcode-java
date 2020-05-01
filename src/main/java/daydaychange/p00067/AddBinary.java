package daydaychange.p00067;

import java.math.BigInteger;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/29 7:42 PM
 */
public class AddBinary {

    /**
     * @param a The input strings are both non-empty and contains only characters 1 or 0.
     * @param b
     * @return sum
     */
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        if (m < n) return addBinary(b, a);

        int len = Math.max(m, n);
        StringBuilder sb = new StringBuilder();
        int carry = 0, j = n - 1;
        for (int i = len - 1; i >= 0; --i) {
            if (a.charAt(i) == '1') ++carry;

            if (j >= 0 && b.charAt(j--) == '1') ++carry;

            if (carry % 2 == 1) sb.append(1);
            else sb.append(0);

            carry /= 2;
        }

        if (carry == 1) sb.append(1);

        sb.reverse();

        return sb.toString();
    }

    public String addBinaryV2(String a, String b) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger carry, answer;
        while (y.compareTo(zero) != 0) {
            // 异或
            answer = x.xor(y);
            // 与
            carry = x.and(y).shiftLeft(1);

            x = answer;
            y = carry;
        }

        return x.toString(2);
    }
}
