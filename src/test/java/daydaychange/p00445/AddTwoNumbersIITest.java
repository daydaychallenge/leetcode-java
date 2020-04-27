package daydaychange.p00445;

import daydaychange.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/27 5:23 PM
 */
class AddTwoNumbersIITest {

    AddTwoNumbersII addTwoNumbersII = new AddTwoNumbersII();
    ListNumberUtil listNumberUtil = new ListNumberUtil();

    @Test
    void addTwoNumberCase1() {

        ListNode la = listNumberUtil.convertToList(7243);
        ListNode lb = listNumberUtil.convertToList(564);

        ListNode res = addTwoNumbersII.addTwoNumbers(la, lb);

        assertEquals(7807, listNumberUtil.convertToNumber(res));
    }

    @Test
    void addTwoNumberCase2() {

        ListNode la = listNumberUtil.convertToList(99999);
        ListNode lb = listNumberUtil.convertToList(99);

        ListNode res = addTwoNumbersII.addTwoNumbers(la, lb);

        assertEquals(100098, listNumberUtil.convertToNumber(res));
    }

    @Test
    void addTwoNumberCase3() {

        ListNode lb = listNumberUtil.convertToList(99);

        ListNode res = addTwoNumbersII.addTwoNumbers(null, lb);

        assertEquals(99, listNumberUtil.convertToNumber(res));
    }


}