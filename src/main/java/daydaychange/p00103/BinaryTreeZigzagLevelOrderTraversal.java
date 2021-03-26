package daydaychange.p00103;

import daydaychange.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode l = new TreeNode(9);
        TreeNode r = new TreeNode(20);
        TreeNode l2 = new TreeNode(15);
        TreeNode r2 = new TreeNode(7);
//        TreeNode l3 = new TreeNode(2);
//        TreeNode r3 = new TreeNode(2);

        root.left = l;
        root.right = r;

//        l.left = l2;
//        l.right = r2;
        r.left = l2;
        r.right = r2;

        zigzagLevelOrder(root);
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int levelCount = 1;
        int nextLevelCount = 0;
        boolean leftToRight = true;
        List<Integer> levelChildren = new ArrayList<>();
        while (!queue.isEmpty()) {
            if (levelCount == 0) {
                // 换方向
                levelCount = nextLevelCount;
                nextLevelCount = 0;
                result.add(levelChildren);
                levelChildren = new ArrayList<>();
                leftToRight = !leftToRight;
            } else {
                if (leftToRight) {
                    // 从左到有，
                    TreeNode node = queue.pop();
                    if (node != null) {
                        levelCount--;
                        levelChildren.add(node.val);
                        if (node.left != null) {
                            queue.addLast(node.left);
                            nextLevelCount++;
                        }
                        if (node.right != null) {
                            queue.addLast(node.right);
                            nextLevelCount++;
                        }
                    }
                } else {
                    // 从右到左，
                    TreeNode node = queue.pollLast();
                    if (node != null) {
                        levelCount--;
                        levelChildren.add(node.val);
                        if (node.right != null) {
                            queue.addFirst(node.right);
                            nextLevelCount++;
                        }
                        if (node.left != null) {
                            queue.addFirst(node.left);
                            nextLevelCount++;
                        }
                    }
                }
            }
        }
        if (!levelChildren.isEmpty()) {
            result.add(levelChildren);
        }
        return result;
    }

    public static List<List<Integer>> zigzagLevelOrder0MS(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        boolean reverse = false;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            LinkedList<Integer> row = new LinkedList<>();
            for (int i = 0; i < count; i++) {
                TreeNode current = queue.poll();
                if (reverse) {
                    row.addFirst(current.val);
                } else {
                    row.addLast(current.val);
                }
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            reverse = !reverse;
            result.add(row);
        }
        return result;
    }

}
