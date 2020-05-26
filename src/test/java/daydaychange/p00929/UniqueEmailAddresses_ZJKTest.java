package daydaychange.p00929;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniqueEmailAddresses_ZJKTest {

    UniqueEmailAddresses_ZJK uniqueEmailAddresses = new UniqueEmailAddresses_ZJK();

    @Test
    public void test1() {
        Assertions.assertEquals(2, uniqueEmailAddresses.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }

}
