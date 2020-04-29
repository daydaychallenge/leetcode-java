package daydaychange.p00067;

public class AddBinary_ZJK {
    public String addBinary(String a, String b) {
        if (a == null || a.isEmpty()) return b;
        if (b == null || b.isEmpty()) return a;
        char[] data1 = a.toCharArray();
        char[] data2 = b.toCharArray();
        int len1 = data1.length;
        int len2 = data2.length;
        int resultLen = len1 > len2 ? len1 + 1 : len2 + 1;
        char[] result = new char[resultLen];
        int carry = 0;
        for (int i = len1 - 1, j = len2 - 1, resultIndex = resultLen - 1; i >= 0 || j >= 0; i --, j --, resultIndex --) {
            int r1 = i >= 0 ? data1[i] - '0' : 0;
            int r2 = j >= 0 ? data2[j] - '0' : 0;
            int r = r1 + r2 + carry;
            if (r > 1) carry = 1;
            else carry = 0;
            result[resultIndex] = (char)(r % 2 + '0');
        }
        if (carry == 1) {
            result[0] = '1';
            return new String(result);
        }
        return new String(result, 1, resultLen - 1);
    }
}
