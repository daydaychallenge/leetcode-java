package daydaychange.common;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/26 4:47 PM
 */
public class ListNode {

    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListNode{");
        sb.append("val=").append(val);
        sb.append(", next=").append(next);
        sb.append('}');
        return sb.toString();
    }
}
