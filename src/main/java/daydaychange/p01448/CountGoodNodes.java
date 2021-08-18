package daydaychange.p01448;

import daydaychange.common.TreeNode;

/**
 * https://leetcode.com/problems/count-good-nodes-in-binary-tree/
 * 1448. Count Good Nodes in Binary Tree
 * Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
 *
 * Return the number of good nodes in the binary tree.
 */
public class CountGoodNodes {
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        int pathMaxVal = root.val;
        return helper(root, pathMaxVal);
    }

    private int helper(TreeNode node, int pathMaxVal) {
        if (node == null) return 0;
        int val = node.val;
        int goodNode = 0;
        if (val >= pathMaxVal) {
            goodNode = 1;
            pathMaxVal = val;
        }
        goodNode += helper(node.left, pathMaxVal) + helper(node.right, pathMaxVal);
        return goodNode;
    }
}
