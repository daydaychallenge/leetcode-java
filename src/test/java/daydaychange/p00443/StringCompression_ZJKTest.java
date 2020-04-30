package daydaychange.p00443;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCompression_ZJKTest {
    StringCompression_ZJK stringCompression = new StringCompression_ZJK();

    @Test
    public void test1() {
        Assertions.assertEquals(1, stringCompression.compress(new char[]{'a'}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(9, stringCompression.compress("aaaabbbbbbbcccccccccccccccccccccdddddd".toCharArray()));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(4, stringCompression.compress("abcd".toCharArray()));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(6, stringCompression.compress("aabccccd".toCharArray()));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(0, stringCompression.compress(null));
    }

    @Test
    public void test6() {
        Assertions.assertEquals(3, stringCompression.compress("oooooooooo".toCharArray()));
    }

}
