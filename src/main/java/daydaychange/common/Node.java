package daydaychange.common;

import java.util.StringJoiner;

public class Node {

    public int val;
    public Node left;
    public Node right;
    public Node next;
    public Node() {}
    public Node(int _val) {
        val = _val;
    }
    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Node.class.getSimpleName() + "[", "]")
                .add("val=" + val)
                .add("left=" + (left == null ? null : left.val + ""))
                .add("right=" + (right == null ? null : right.val + ""))
                .add("next=" + (next == null ? null : next.val + ""))
                .toString();
    }
}