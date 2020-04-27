package daydaychange.p00002;

import daydaychange.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/26 4:59 PM
 */
class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    ListNumberUtil listNumberUtil = new ListNumberUtil();

    @Test
    void addTwoNumbersCase1() {
        ListNode la = listNumberUtil.convertToList(342);
        ListNode lb = listNumberUtil.convertToList(465);

        assertEquals(807,
                listNumberUtil.convertToNumber(
                        addTwoNumbers.addTwoNumbers(la, lb)));
    }

    @Test
    void addTwoNumbersCase2() {
        ListNode la = listNumberUtil.convertToList(99);
        ListNode lb = listNumberUtil.convertToList(2);

        assertEquals(101,
                listNumberUtil.convertToNumber(
                        addTwoNumbers.addTwoNumbers(la, lb)));
    }

    @Test
    void addTwoNumbersCase3() {
        ListNode la = listNumberUtil.convertToList(999);
        ListNode lb = listNumberUtil.convertToList(999);

        assertEquals(1998,
                listNumberUtil.convertToNumber(
                        addTwoNumbers.addTwoNumbers(la, lb)));
    }

    @Test
    void addTwoNumbersCase4() {
        ListNode la = listNumberUtil.convertToList(999);
        assertEquals(null,
                addTwoNumbers.addTwoNumbers(la, null));
    }


}