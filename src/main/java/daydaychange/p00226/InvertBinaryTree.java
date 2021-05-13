package daydaychange.p00226;

import daydaychange.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left= root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public TreeNode invertTree1(TreeNode root) {
        if (root == null) return null;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode pop = queue.pop();
            TreeNode tmp = pop.left;
            pop.left= pop.right;
            pop.right = tmp;
            if (Objects.nonNull(pop.left)) queue.add(pop.left);
            if (Objects.nonNull(pop.right)) queue.add(pop.right);
        }
        return root;
    }

}
