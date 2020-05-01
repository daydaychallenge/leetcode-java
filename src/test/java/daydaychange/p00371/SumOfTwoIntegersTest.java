package daydaychange.p00371;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/2 7:21 AM
 */
class SumOfTwoIntegersTest {

    SumOfTwoIntegers sumOfTwoIntegers = new SumOfTwoIntegers();

    @Test
    void getSumCase1() {
        assertEquals(1, sumOfTwoIntegers.getSum(1, 0));
    }

    @Test
    void getSumCase2() {
        assertEquals(2, sumOfTwoIntegers.getSum(0, 2));
    }

    @Test
    void getSumCase3() {
        assertEquals(11, sumOfTwoIntegers.getSum(5, 6));
    }

    @Test
    void getSumCase4() {
        assertEquals(-1, sumOfTwoIntegers.getSum(5, -6));
    }

    @Test
    void getSumCase5() {
        assertEquals(0, sumOfTwoIntegers.getSum(-999, 999));
    }
}