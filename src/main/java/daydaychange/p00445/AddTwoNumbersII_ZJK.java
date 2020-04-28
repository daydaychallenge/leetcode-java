package daydaychange.p00445;

import daydaychange.common.ListNode;
import javafx.beans.value.ObservableNumberValue;

import java.util.Stack;

/**
 * @author ZhangJiangke
 * @version 1.0
 * @date 2020/4/27 4:16 PM
 */
public class AddTwoNumbersII_ZJK {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode ans = new ListNode(-1);
        ListNode la = l1, lb = l2;
        int len1 = 0, len2 = 0;
        while (la != null) {
            len1 ++;
            la = la.next;
        }
        while (lb != null) {
            len2 ++;
            lb = lb.next;
        }

        ListNode dummy = new ListNode(-1);
        int carry = 0;
        if (len1 < len2) {
            dummy.next = l1;
            carry = helper(ans, l2, dummy, len2 - len1);
        } else if (len1 > len2) {
            dummy.next = l2;
            carry = helper(ans, l1, dummy, len1 - len2);
        } else {
            carry = helper(ans, l1, l2, 0);
        }
        if (carry == 1) {
            ListNode node = new ListNode(1);
            node.next = ans.next;
            return node;
        }
        return ans.next;
    }

    public int helper(ListNode ans, ListNode l1, ListNode l2, int k) {
        int carry = 0;
        if (l1 == null) return 0;
        if (k == 0) {
            carry = helper(ans, l1.next, l2.next, k);
        } else if (k == 1) {
            carry = helper(ans, l1.next, l2.next, k - 1);
        } else {
            carry = helper(ans, l1.next, l2, k - 1);
        }
        int val = 0;
        if (l2.val == -1) {
            val = l1.val + carry;
        } else {
            val = l1.val + l2.val + carry;
        }
        carry = val / 10;
        ListNode node = new ListNode(val % 10);
        node.next = ans.next;
        ans.next = node;
        return carry;
    }

}
