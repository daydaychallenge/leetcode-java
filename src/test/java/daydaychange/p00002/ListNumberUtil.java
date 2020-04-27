package daydaychange.p00002;

import daydaychange.common.ListNode;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/27 6:02 PM
 */
class ListNumberUtil {

    /**
     * return list  represent by int
     * int:564, res list as: 4->6->5,
     *
     * @param number
     * @return
     */
    public ListNode convertToList(int number) {
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

    /**
     * return int val represent by list
     * <p>
     * list as: 5->6->4, res int:465
     *
     * @param list
     * @return
     */
    public int convertToNumber(ListNode list) {
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
