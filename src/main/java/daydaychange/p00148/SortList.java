package daydaychange.p00148;

import daydaychange.common.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        Collections.sort(values);
        ListNode dump = new ListNode();
        ListNode dump1 = dump;
        for (int i : values) {
            ListNode node = new ListNode(i);
            dump.next = node;
            dump = node;
        }
        return dump1.next;
    }

    public ListNode sortList1(ListNode head) {
        if (head == null) return null;
        ListNode current = head.next;
        while (current != null) {
            ListNode d = current;
            current = current.next;
            d.next = null;
            insert(head, d);
        }
        return head;
    }

    private void insert(ListNode head, ListNode current) {
        int cVal = current.val;
        while (head != null) {
            int hVal = head.val;
            if (cVal > hVal) {
                head = head.next;
            } else {
                ListNode next = head.next;
                head.next = current;
                current.next = next;
            }
        }
    }

}
