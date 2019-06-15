package lint_code.tree;

/**
 * @author wjianwu 2019/6/11 11:27
 */
public class InvertBinaryTree {

    public void invertBinaryTree(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left != null) {
            invertBinaryTree(root.left);
        }
        if (root.right != null) {
            invertBinaryTree(root.right);
        }
    }

}
