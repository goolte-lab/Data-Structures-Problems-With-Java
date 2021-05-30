package dsquestions.trees;

import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    List<TreeNode> children;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
