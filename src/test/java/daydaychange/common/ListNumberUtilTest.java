package daydaychange.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/27 5:46 PM
 */
public class ListNumberUtilTest {

    private ListNumberUtil listNumberUtil = new ListNumberUtil();

    @Test
    void convertToListCase() {
        assertEquals(564, listNumberUtil.convertToNumber(listNumberUtil.convertToList(564)));
    }


    @Test
    void convertToNumberCase() {
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(6);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(2);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        assertEquals(5642, listNumberUtil.convertToNumber(n1));
    }
}
