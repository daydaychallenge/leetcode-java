package daydaychange.p00443;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/2 11:49 PM
 */
class StringCompressionTest {

    StringCompression compression = new StringCompression();

    @Test
    void compressCase1() {
        char[] param = {'a'};
        assertEquals(1, compression.compress(param));
    }

    @Test
    void compressCase2() {
        char[] param = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        assertEquals(6, compression.compress(param));
    }

    @Test
    void compressCase3() {
        char[] param = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        assertEquals(4, compression.compress(param));
    }
}