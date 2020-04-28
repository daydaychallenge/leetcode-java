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
        ListNode res = plusOneLinkedList.plusOne(la, 10);
        assertEquals(7253, listNumberUtil.convertToNumber(res));
    }

    @Test
    public void test2() {
        ListNode la = listNumberUtil.convertToList(9999);
        ListNode res = plusOneLinkedList.plusOne(la, 1);
        assertEquals(10000, listNumberUtil.convertToNumber(res));
    }

    @Test
    public void test3() {
        ListNode la = listNumberUtil.convertToList(7243);
        ListNode res = plusOneLinkedList.plusOne(la, 0);
        assertEquals(7243, listNumberUtil.convertToNumber(res));
    }

    @Test
    public void test4() {
        ListNode res = plusOneLinkedList.plusOne(null, 10);
        assertEquals(10, listNumberUtil.convertToNumber(res));
    }

}
