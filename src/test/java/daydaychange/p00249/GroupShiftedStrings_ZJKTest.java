package daydaychange.p00249;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GroupShiftedStrings_ZJKTest {

    GroupShiftedStrings_ZJK groupShiftedStrings = new GroupShiftedStrings_ZJK();

    @Test
    public void test1() {
        Assertions.assertEquals(4, groupShiftedStrings.groupStrings(new String[]{"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"}).size());
    }

}
