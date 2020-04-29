package daydaychange.p00369;

import daydaychange.common.ListNode;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/29 7:02 PM
 */
public class PlusOneLinkedList {

    public ListNode plusOne(ListNode head) {
        // sentinel head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // find the rightmost not-nine digit
        ListNode notNine = dummy, p = head;
        while (p != null) {
            if (p.val != 9) notNine = p;

            p = p.next;
        }

        // increase this rightmost not-nine digit by 1
        notNine.val++;
        notNine = notNine.next;

        // set all the following nines to zeros
        while (notNine != null) {
            notNine.val = 0;
            notNine = notNine.next;
        }

        return dummy.val == 0 ? dummy.next : dummy;
    }
}
