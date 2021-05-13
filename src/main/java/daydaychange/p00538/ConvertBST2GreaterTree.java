package daydaychange.p00538;

import daydaychange.common.TreeNode;

public class ConvertBST2GreaterTree {
    public TreeNode convertBST(TreeNode root) {
        helper(root, 0);
        return root;
    }

    private int helper(TreeNode node, int sum) {
        if (node == null) return sum;
        int rightSum = helper(node.right, sum);
        int rootSum = rightSum + node.val;
        node.val = rootSum;
        return helper(node.left, rootSum);
    }

}
