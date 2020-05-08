package daydaychange.p00336;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @auth: Zhangjk
 * @Date: 2020/5/8 5:38 下午
 */
public class PalindromePairs_ZJKTest {

    PalindromePairs_ZJK palindromePairs = new PalindromePairs_ZJK();

    @Test
    public void test1() {
        List<List<Integer>> r = palindromePairs.palindromePairs(new String[]{"abcd","dcba","lls","s","sssll"});
        Assertions.assertEquals(4, r.size());
    }

    @Test
    public void test2() {
        List<List<Integer>> r = palindromePairs.palindromePairs(new String[]{"bat","tab","cat"});
        Assertions.assertEquals(2, r.size());
    }

}
