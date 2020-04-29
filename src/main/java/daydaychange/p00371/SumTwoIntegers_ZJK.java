package daydaychange.p00371;

public class SumTwoIntegers_ZJK {

    /**
     * copy from https://leetcode.com/problems/sum-of-two-integers/discuss/84278/A-summary%3A-how-to-use-bit-manipulation-to-solve-problems-easily-and-efficiently
     * 二进制算法， 异或实现相加， 与实现进位，左移一位， 表示， 需要进位的数应该与和的左面一位相加
     * @param a
     * @param b
     * @return
     */
    public int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        int sum = 0;
        while (b != 0) {
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return sum;
    }

}
