package daydaychange.p01003;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/12 10:25 AM
 */
class ValidAbcString_ZJKTest {

    private ValidAbcString_ZJK validAbcString = new ValidAbcString_ZJK();

    @Test
    void isValidCase1() {
        assertEquals(false, validAbcString.isValid("a"));
    }

    @Test
    void isValidCase2() {
        assertEquals(false, validAbcString.isValid("b"));
    }

    @Test
    void isValidCase3() {
        assertEquals(false, validAbcString.isValid("c"));
    }

    @Test
    void isValidCase4() {
        assertEquals(false, validAbcString.isValid("ab"));
    }

    @Test
    void isValidCase5() {
        assertEquals(true, validAbcString.isValid("abc"));
    }

    @Test
    void isValidCase6() {
        assertEquals(true, validAbcString.isValid("aabcbc"));
    }

    @Test
    void isValidCase7() {
        assertEquals(true, validAbcString.isValid("abcabcababcc"));
    }

    @Test
    void isValidCase8() {
        assertEquals(false, validAbcString.isValid("abccba"));
    }

    @Test
    void isValidCase9() {
        assertEquals(false, validAbcString.isValid("abcabcab"));
    }

}