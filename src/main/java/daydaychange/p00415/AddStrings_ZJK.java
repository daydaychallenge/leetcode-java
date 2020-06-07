package daydaychange.p00415;

public class AddStrings_ZJK {
    public String addStrings(String num1, String num2) {
        if (num1 == null || num1.isEmpty()) return num2;
        if (num2 == null || num2.isEmpty()) return num1;

        int maxLen = Math.max(num1.length(), num2.length());
        char[] result = new char[maxLen + 1];
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            char c1 = '0';
            if (i >= 0) {
                c1 = num1.charAt(i);
            }
            char c2 = '0';
            if (j >= 0) {
                c2 = num2.charAt(j);
            }
            int sum = c1 + c2 - '0' - '0' + carry;
            if (sum > 9) {
                carry = 1;
            } else carry = 0;
            result[maxLen --] = (char) (sum % 10 + '0') ;
            i --;
            j --;
        }
        if (carry == 1) {
            result[0] = '1';
            return new String(result);
        }
        return new String(result, 1, result.length - 1);
    }
}
