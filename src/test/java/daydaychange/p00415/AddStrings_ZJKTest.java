package daydaychange.p00415;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddStrings_ZJKTest {

    AddStrings_ZJK addStrings = new AddStrings_ZJK();

    @Test
    public void test() {
        Assertions.assertEquals("1011", addStrings.addStrings("10", "1001"));
    }


}
