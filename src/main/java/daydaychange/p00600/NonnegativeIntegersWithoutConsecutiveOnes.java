package daydaychange.p00600;

/**
 * https://leetcode.com/problems/non-negative-integers-without-consecutive-ones/
 * 600. Non-negative Integers without Consecutive Ones
 * Given a positive integer n, return the number of the integers in the range [0, n]
 * whose binary representations do not contain consecutive ones.
 * Example 1:
 *
 * Input: n = 5
 * Output: 5
 * Explanation:
 * Here are the non-negative integers <= 5 with their corresponding binary representations:
 * 0 : 0
 * 1 : 1
 * 2 : 10
 * 3 : 11
 * 4 : 100
 * 5 : 101
 * Among them, only integer 3 disobeys the rule (two consecutive ones) and the other 5 satisfy the rule.
 * Example 2:
 *
 * Input: n = 1
 * Output: 2
 * Example 3:
 *
 * Input: n = 2
 * Output: 3
 *
 *
 * Constraints:
 *
 * 1 <= n <= 109
 *
 */
public class NonnegativeIntegersWithoutConsecutiveOnes {
    public int findIntegers(int num) {
        int count = 0;
        for (int i = 0; i <= num; i++)
            if (check(i))
                count++;
        return count;
    }
    public boolean check(int n) {
        int i = 31;
        while (i > 0) {
            if ((n & (1 << i)) != 0 && (n & (1 << (i - 1))) != 0)
                return false;
            i--;
        }
        return true;
    }
}
