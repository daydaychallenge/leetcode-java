package daydaychange.p00369;

import daydaychange.common.ListNode;

public class PlusOneLinkedList_ZJK {

    public ListNode plusOne(ListNode node) {
        if (node == null) {
            ListNode t = new ListNode(1);
            return t;
        }
        ListNode ans = new ListNode(-1);
        int carry = helper(ans, node);
        if (carry == 1) {
            ListNode node1 = new ListNode(carry);
            node1.next = ans.next;
            return node1;
        }
        return ans.next;
    }

    public int helper(ListNode ans, ListNode node) {
        if (node == null) {
            return 1;
        }
        int carry = helper(ans, node.next);
        int val = carry + node.val;
        ListNode node1 = new ListNode(val % 10);
        node1.next = ans.next;
        ans.next = node1;
        carry = val / 10;
        return carry;
    }

}
