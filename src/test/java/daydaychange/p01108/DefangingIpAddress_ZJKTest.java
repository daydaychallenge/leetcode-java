package daydaychange.p01108;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DefangingIpAddress_ZJKTest {

    DefangingIPAddress_ZJK defangingIPAddress = new DefangingIPAddress_ZJK();

    @Test
    public void test1() {
        Assertions.assertEquals("255[.]100[.]50[.]0", defangingIPAddress.defangIPaddr("255.100.50.0"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("255[.]100[.]50[.]100", defangingIPAddress.defangIPaddr("255.100.50.100"));
    }

    @Test
    public void test3() {
        Assertions.assertEquals("255[.]100[.]150[.]100", defangingIPAddress.defangIPaddr("255.100.150.100"));
    }


}
