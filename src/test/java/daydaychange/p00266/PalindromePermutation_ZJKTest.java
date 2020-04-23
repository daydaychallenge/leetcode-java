package daydaychange.p00266;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author ZhangJiangke
 * @Date 2020-04-23 10:27
 */
public class PalindromePermutation_ZJKTest {

    PalindromePermutation_ZJK palindromePermutation = new PalindromePermutation_ZJK();

    @Test
    public void test() {
        Assertions.assertEquals(Boolean.FALSE, palindromePermutation.canPermutePalindrome("AaBb//a"));
    }

}
