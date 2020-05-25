package daydaychange.p00937;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReorderData_ZJKTest {

    ReorderData_ZJK reorderData = new ReorderData_ZJK();

    @Test
    public void test1() {
        String[] ret = reorderData.reorderLogFiles(new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"});
        String act = "let1 art can let3 art zero let2 own kit dig dig1 8 1 5 1 dig2 3 6";
        String r = String.join(" ", ret);
        Assertions.assertEquals(act, r);
    }

}
