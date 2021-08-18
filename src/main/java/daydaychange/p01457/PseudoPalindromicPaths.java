package daydaychange.p01457;

import daydaychange.common.TreeNode;

/**
 * https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/
 * Given a binary tree where node values are digits from 1 to 9. A path in the binary tree is
 * said to be pseudo-palindromic if at least one permutation of the node values in the path is a palindrome.
 *
 * Return the number of pseudo-palindromic paths going from the root node to leaf nodes.
 */
public class PseudoPalindromicPaths {

    int[] arr = new int[10];

    public static void main(String[] args) {
        PseudoPalindromicPaths p = new PseudoPalindromicPaths();
        TreeNode r = new TreeNode(2);
        TreeNode r1 = new TreeNode(3);
        TreeNode r2 = new TreeNode(1);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(1);
        TreeNode r5 = new TreeNode(1);

        r.left = r1;
        r.right = r2;
        r1.left = r3;
        r1.right = r4;
        r2.right = r5;

        int i = p.pseudoPalindromicPaths(r);
        System.out.println(i);

    }

    public int pseudoPalindromicPaths (TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode node, int count) {
        if (node == null) return 0;
        int v = node.val;
        arr[v] += 1;
        count ++;
        int c = 0;
        if (node.left == null && node.right == null) {
            // left
            if (judge(count)) {
                c = 1;
            }
        }
        if (node.left != null) {
            c += helper(node.left, count);
        }
        if (node.right != null) {
            c += helper(node.right, count);
        }
        arr[v] -= 1;
        return c;
    }

    private boolean judge(int count) {
        if (count == 1) return true;
        if ((count & 1) == 1) {
            // 基数，说明允许数组里面有一个元素的个数为奇数，其它必须是偶数
            boolean hasOne = false;
            for (int i = 1; i < 10; i++) {
                int v = arr[i];
                if ((v & 1) == 1) {
                    if (hasOne) {
                        return false;
                    } else {
                        hasOne = true;
                    }
                }
            }
        } else {
            for (int i = 1; i < 10; i++) {
                int v = arr[i];
                if ((v & 1) == 1) {
                    return false;
                }
            }
        }
        return true;
    }


}
