package daydaychange.p00100;

import daydaychange.common.TreeNode;

import java.util.Objects;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        foreach(p, sb1);
        foreach(q, sb2);
        return Objects.equals(sb1.toString(), sb2.toString());
    }

    private void foreach(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("N").append("#");
        } else {
            sb.append(node.val).append("#");
            foreach(node.left, sb);
            foreach(node.right, sb);
        }
    }

}
