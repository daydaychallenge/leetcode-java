package daydaychange.p00049;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GroupAnagrams_ZJKTest {

    GroupAnagrams_ZJK groupAnagrams = new GroupAnagrams_ZJK();

    @Test
    public void test1() {
       List<List<String>> result = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        Assertions.assertEquals(3, result.size());
    }

}
