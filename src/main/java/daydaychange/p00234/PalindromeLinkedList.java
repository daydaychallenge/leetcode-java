package daydaychange.p00234;

import daydaychange.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        List<Integer> array = new ArrayList<>();
        while (head != null) {
            array.add(head.val);
            head = head.next;
        }
        int start = 0, end = array.size() - 1;

        while (start <= end) {
            if (Objects.equals(array.get(start), array.get(end))) {
                start ++;
                end --;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre  = null;
        ListNode prepre  = null;

        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
            pre.next = prepre;
            prepre = pre;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (pre != null && slow != null) {
            if (pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }
}
