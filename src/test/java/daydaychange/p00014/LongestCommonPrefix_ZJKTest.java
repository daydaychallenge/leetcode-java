package daydaychange.p00014;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefix_ZJKTest {

    LongestCommonPrefix_ZJK longestCommonPrefix = new LongestCommonPrefix_ZJK();

    @Test
    public void test1() {
        Assertions.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("ab", longestCommonPrefix.longestCommonPrefix(new String[]{"abab","aba","abc"}));
    }

}
