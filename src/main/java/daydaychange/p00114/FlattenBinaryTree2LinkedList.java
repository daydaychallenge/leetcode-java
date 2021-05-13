package daydaychange.p00114;

import daydaychange.common.TreeNode;

public class FlattenBinaryTree2LinkedList {

    public static void main(String[] args) {

        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(4);
        TreeNode r5 = new TreeNode(5);
        TreeNode r6 = new TreeNode(6);
        TreeNode r7 = new TreeNode(7);
        TreeNode r8 = new TreeNode(8);


        r1.left = r2;
        r1.right = r5;

        r2.left = r3;
        r2.right = r4;
        r5.right = r6;
        r3.left = r7;
        r3.right = r8;

        FlattenBinaryTree2LinkedList f = new FlattenBinaryTree2LinkedList();
        f.flatten(r1);
        System.out.println("=====");

    }

    public void flatten(TreeNode root) {
        if (root == null) return;
        if (root.left != null) flatten(root.left);
        if (root.right != null) flatten(root.right);
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = null;
        while (root.right != null) root = root.right;
        root.right = tmp;
    }
}
