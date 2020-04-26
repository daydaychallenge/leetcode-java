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

    @Test
    void addTwoNumbersCase1() {
        assertEquals(807,
                convertToNumber(
                        addTwoNumbers.addTwoNumbers(convertToList(342), convertToList(465))));
    }

    @Test
    void addTwoNumbersCase2() {
        assertEquals(101,
                convertToNumber(
                        addTwoNumbers.addTwoNumbers(convertToList(99), convertToList(2))));
    }

    @Test
    void addTwoNumbersCase3() {
        assertEquals(1998,
                convertToNumber(
                        addTwoNumbers.addTwoNumbers(convertToList(999), convertToList(999))));
    }

    @Test
    void addTwoNumbersCase4() {
        assertEquals(null,
                addTwoNumbers.addTwoNumbers(convertToList(999), null));
    }

    private ListNode convertToList(int number) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (number != 0) {
            int v = number % 10;
            ListNode node = new ListNode(v);
            tail.next = node;
            tail = tail.next;
            number = number / 10;
        }

        return dummy.next;
    }

    private int convertToNumber(ListNode list) {
        ListNode p = list;
        int loop = 1, res = 0;
        while (p != null) {
            res += (loop * p.val);
            loop *= 10;
            p = p.next;
        }

        return res;
    }
}