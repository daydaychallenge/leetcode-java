package daydaychange.common;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/27 5:44 PM
 */
public class ListNumberUtil {

    /**
     * return list  represent by int
     * int:564, res list as: 5->6->4,
     *
     * @param number
     * @return
     */
    public ListNode convertToList(int number) {
        ListNode res = null;
        while (number != 0) {
            int v = number % 10;
            ListNode node = new ListNode(v);
            node.next = res;
            res = node;
            number = number / 10;
        }
        return res;
    }

    /**
     * return int val represent by list
     * <p>
     * list as: 5->6->4, res int:564
     *
     * @param list
     * @return
     */
    public int convertToNumber(ListNode list) {
        ListNode p = list;
        int res = 0;
        while (p != null) {
            res = res * 10 + p.val;
            p = p.next;
        }

        return res;
    }
}
