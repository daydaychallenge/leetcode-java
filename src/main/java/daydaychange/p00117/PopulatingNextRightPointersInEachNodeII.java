package daydaychange.p00117;

import daydaychange.common.Node;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class PopulatingNextRightPointersInEachNodeII {

    public Node connect(Node root) {
        if (root == null) return null;
        Deque<Node> queue = new LinkedList<>();
        if (Objects.nonNull(root.left)) queue.add(root.left);
        if (Objects.nonNull(root.right)) queue.add(root.right);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                Node left = queue.pop();
                if (size != 1) left.next = queue.peek();
                size --;
                if (Objects.nonNull(left.left)) queue.add(left.left);
                if (Objects.nonNull(left.right)) queue.add(left.right);
            }
        }
        return root;
    }



}
