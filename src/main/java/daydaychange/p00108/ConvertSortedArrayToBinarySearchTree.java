package daydaychange.p00108;

import daydaychange.common.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, start, mid);
        node.right = helper(nums, mid, end);
        return node;
    }

}
