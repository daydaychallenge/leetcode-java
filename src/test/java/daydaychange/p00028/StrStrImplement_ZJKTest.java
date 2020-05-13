package daydaychange.p00028;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrStrImplement_ZJKTest {

    StrStrImplement_ZJK strImplement = new StrStrImplement_ZJK();

    @Test
    public void test1() {
        Assertions.assertEquals(2, strImplement.strStr("hello", "ll"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(0, strImplement.strStr("a", "a"));
    }

}
