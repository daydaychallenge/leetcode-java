package daydaychange.p00002;

import daydaychange.common.ListNode;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/26 4:47 PM
 */
public class AddTwoNumbers_ZJK {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return null;
        ListNode dummy = new ListNode(0);
        ListNode pa = l1, pb = l2, p = dummy;
        int carry = 0;

        while (pa != null && pb != null) {
            int val = pa.val + pb.val + carry;
            if (val > 9) {
                val = val - 10;
                carry = 1;
            } else carry = 0;
            ListNode node = new ListNode(val);
            p.next = node;
            p = node;
            pa = pa.next;
            pb = pb.next;
        }

        while (pa != null) {
            int val = pa.val + carry;
            if (val > 9) {
                val = val - 10;
                carry = 1;
            } else carry = 0;
            ListNode node = new ListNode(val);
            p.next = node;
            if (carry == 0) {
                node.next = pa.next;
                break;
            }
            p = node;
            pa = pa.next;
        }

        while (pb != null) {
            int val = pb.val + carry;
            if (val > 9) {
                val = val - 10;
                carry = 1;
            } else carry = 0;
            ListNode node = new ListNode(val);
            p.next = node;
            if (carry == 0) {
                node.next = pb.next;
                break;
            }
            p = node;
            pb = pb.next;
        }
        if (carry == 1) {
            ListNode node = new ListNode(1);
            p.next = node;
        }
        return dummy.next;
    }
}
