package daydaychange.p00371;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumTwoIntegers_ZJKTest {

    SumTwoIntegers_ZJK sumTwoIntegers = new SumTwoIntegers_ZJK();

    @Test
    public void test1() {
        Assertions.assertEquals(10, sumTwoIntegers.getSum(5, 5));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(124456, sumTwoIntegers.getSum(1000, 123456));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(5, sumTwoIntegers.getSum(5, 0));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(0, sumTwoIntegers.getSum(5, -5));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(10, sumTwoIntegers.getSum(1, 9));
    }

    @Test
    public void test6() {
        Assertions.assertEquals(-5, sumTwoIntegers.getSum(-2, -3));
    }

    @Test
    public void test7() {
        Assertions.assertEquals(0, sumTwoIntegers.getSum(-5, 5));
    }

}
