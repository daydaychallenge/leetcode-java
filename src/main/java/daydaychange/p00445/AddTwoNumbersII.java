package daydaychange.p00445;

import daydaychange.common.ListNode;

import java.util.Stack;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/27 4:16 PM
 */
public class AddTwoNumbersII {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        Stack<Integer> sa = new Stack<>();
        while (l1 != null) {
            sa.push(l1.val);
            l1 = l1.next;
        }
        Stack<Integer> sb = new Stack<>();
        while (l2 != null) {
            sb.push(l2.val);
            l2 = l2.next;
        }

        ListNode res = null;
        int carry = 0;
        while (!sa.isEmpty() || !sb.isEmpty() || carry > 0) {
            Integer va = sa.isEmpty() ? 0 : sa.pop();
            Integer vb = sb.isEmpty() ? 0 : sb.pop();
            int nv = va + vb + carry;
            carry = nv / 10;
            ListNode node = new ListNode(nv % 10);
            node.next = res;
            res = node;
        }

        return res;
    }
}
