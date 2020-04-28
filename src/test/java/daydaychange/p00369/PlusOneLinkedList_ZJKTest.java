package daydaychange.p00369;

import daydaychange.common.ListNode;
import daydaychange.common.ListNumberUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlusOneLinkedList_ZJKTest {
    PlusOneLinkedList_ZJK plusOneLinkedList = new PlusOneLinkedList_ZJK();
    ListNumberUtil listNumberUtil = new ListNumberUtil();

    @Test
    public void test1() {
        ListNode la = listNumberUtil.convertToList(7243);
        ListNode res = plusOneLinkedList.plusOne(la);
        assertEquals(7244, listNumberUtil.convertToNumber(res));
    }

    @Test
    public void test2() {
        ListNode la = listNumberUtil.convertToList(9999);
        ListNode res = plusOneLinkedList.plusOne(la);
        assertEquals(10000, listNumberUtil.convertToNumber(res));
    }

    @Test
    public void test3() {
        ListNode res = plusOneLinkedList.plusOne(null);
        assertEquals(1, listNumberUtil.convertToNumber(res));
    }

}
