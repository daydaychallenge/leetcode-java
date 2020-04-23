package daydaychange.p00266;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/23 3:25 PM
 */
class PalindromePermutationTest {

    PalindromePermutation palindromePermutation = new PalindromePermutation();

    @Test
    void canPermutePalindromeCase1() {
        assertEquals(false, palindromePermutation.canPermutePalindrome("code"));
    }

    @Test
    void canPermutePalindromeCase2() {
        assertEquals(true, palindromePermutation.canPermutePalindrome("aab"));
    }

    @Test
    void canPermutePalindromeCase3() {
        assertEquals(true, palindromePermutation.canPermutePalindrome("carerac"));
    }

    @Test
    void canPermutePalindromeCase4() {
        assertEquals(true, palindromePermutation.canPermutePalindrome(null));
    }
}