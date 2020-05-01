package daydaychange.p00371;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/2 7:18 AM
 */
public class SumOfTwoIntegers {

    public int getSum(int a, int b) {
        int carry, answer;
        while (b != 0) {
            answer = a ^ b;
            carry = (a & b) << 1;

            a = answer;
            b = carry;
        }

        return a;
    }

}
