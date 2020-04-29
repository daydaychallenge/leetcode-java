package daydaychange.p00369;

import daydaychange.common.ListNode;
import daydaychange.common.ListNumberUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/29 7:11 PM
 */
class PlusOneLinkedListTest {

    private PlusOneLinkedList plusOneLinkedList = new PlusOneLinkedList();
    ListNumberUtil listNumberUtil = new ListNumberUtil();

    @Test
    void plusOneCase1() {
        ListNode head = listNumberUtil.convertToList(564);
        assertEquals(565, listNumberUtil.convertToNumber(plusOneLinkedList.plusOne(head)));
    }

    @Test
    void plusOneCase2() {
        ListNode head = listNumberUtil.convertToList(999);
        assertEquals(1000, listNumberUtil.convertToNumber(plusOneLinkedList.plusOne(head)));
    }

    @Test
    void plusOneCase3() {
        ListNode head = listNumberUtil.convertToList(1291);
        assertEquals(1292, listNumberUtil.convertToNumber(plusOneLinkedList.plusOne(head)));
    }
}