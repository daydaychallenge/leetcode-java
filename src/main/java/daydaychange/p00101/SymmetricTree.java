package daydaychange.p00101;

import daydaychange.common.TreeNode;

import java.util.LinkedList;

public class SymmetricTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l = new TreeNode(42);
        TreeNode r = new TreeNode(42);
        TreeNode l2 = new TreeNode(2);
        TreeNode r2 = new TreeNode(2);
        TreeNode l3 = new TreeNode(2);
        TreeNode r3 = new TreeNode(2);

        root.left = l;
        root.right = r;

        l.left = l2;
//        l.right = r2;
//        r.left = l3;
//        r.right = r3;

        System.out.println(isSymmetric(root));

    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()) {
            TreeNode node1 = queue.pop();
            TreeNode node2 = queue.pop();
            if (node1 == null && node2 == null) continue;
            if (node1 == null || node2 == null) return false;
            if (node1.val != node2.val) return false;
            queue.add(node1.left);
            queue.add(node2.right);
            queue.add(node1.right);
            queue.add(node2.left);
        }
        return true;
    }

}
