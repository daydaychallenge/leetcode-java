package daydaychange.p00369;

import daydaychange.common.ListNode;

public class PlusOneLinkedList_ZJK {

    public ListNode plusOne(ListNode node, int k) {
        if (k == 0) return node;
        if (node == null) {
            ListNode t = new ListNode(k);
            return t;
        }
        ListNode ans = new ListNode(-1);
        int carry = helper(ans, node, k);
        if (carry == 1) {
            ListNode node1 = new ListNode(carry);
            node1.next = ans.next;
            return node1;
        }
        return ans.next;
    }

    public int helper(ListNode ans, ListNode node, int k) {
        if (node == null) {
            return 0;
        }
        int carry = helper(ans, node.next, k);
        int val = carry + node.val;
        if (node.next == null) {
            val += k;
        }
        ListNode node1 = new ListNode(val % 10);
        node1.next = ans.next;
        ans.next = node1;
        carry = val / 10;
        return carry;
    }

}
