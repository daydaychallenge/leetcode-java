package daydaychange.p00067;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/2 6:51 AM
 */
class AddBinaryTest {

    AddBinary addBinary = new AddBinary();

    @Test
    void addBinaryCase1() {
        String resa = addBinary.addBinary("11", "1");
        assertEquals("100", resa);
        String resb = addBinary.addBinaryV2("11", "1");
        assertEquals("100", resb);
    }

    @Test
    void addBinaryCase2() {
        String resa = addBinary.addBinary("11", "11");
        assertEquals("110", resa);
        String resb = addBinary.addBinaryV2("11", "11");
        assertEquals("110", resb);
    }

    @Test
    void addBinaryCase3() {
        String resa = addBinary.addBinary("101", "101");
        assertEquals("1010", resa);
        String resb = addBinary.addBinaryV2("101", "101");
        assertEquals("1010", resb);
    }

    @Test
    void addBinaryCase4() {
        String resa = addBinary.addBinary("110", "1");
        assertEquals("111", resa);
        String resb = addBinary.addBinaryV2("110", "1");
        assertEquals("111", resb);
    }

    @Test
    void addBinaryCase5() {
    }
}