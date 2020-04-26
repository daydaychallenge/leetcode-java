package daydaychange.p00002;

import daydaychange.common.ListNode;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/26 4:47 PM
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return null;

        ListNode dummy = new ListNode(0);
        ListNode pa = l1, pb = l2, p = dummy;
        int carry = 0;
        while (pa != null && pb != null) {
            int v = pa.val + pb.val + carry;
            int curV = v % 10;
            carry = v / 10;
            ListNode node = new ListNode(curV);
            p.next = node;
            p = p.next;
            pa = pa.next;
            pb = pb.next;
        }

        while (pa != null) {
            int v = pa.val + carry;
            int curV = v % 10;
            carry = v / 10;
            ListNode node = new ListNode(curV);
            p.next = node;
            p = p.next;
            pa = pa.next;
        }
        while (pb != null) {
            int v = pb.val + carry;
            int curV = v % 10;
            carry = v / 10;
            ListNode node = new ListNode(curV);
            p.next = node;
            p = p.next;
            pb = pb.next;
        }

        if (carry != 0) {
            ListNode node = new ListNode(carry);
            p.next = node;
            p = p.next;
        }

        return dummy.next;
    }
}
