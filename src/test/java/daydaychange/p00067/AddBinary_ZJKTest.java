package daydaychange.p00067;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddBinary_ZJKTest {
    AddBinary_ZJK addBinary = new AddBinary_ZJK();

    @Test
    public void test1() {
        Assertions.assertEquals("11", addBinary.addBinary("10", "1"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("100", addBinary.addBinary("11", "1"));
    }

    @Test
    public void test3() {
        Assertions.assertEquals("101", addBinary.addBinary("10", "11"));
    }

    @Test
    public void test4() {
        Assertions.assertEquals("1", addBinary.addBinary("0", "1"));
    }

    @Test
    public void test5() {
        Assertions.assertEquals("1100", addBinary.addBinary("111", "101"));
    }

    @Test
    public void test6() {
        Assertions.assertEquals("110", addBinary.addBinary("100", "10"));
    }

    @Test
    public void test7() {
        Assertions.assertEquals("10101", addBinary.addBinary("1010", "1011"));
    }

}
