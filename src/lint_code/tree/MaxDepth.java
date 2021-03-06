package lint_code.tree;

/**
 * @author wjianwu 2019/6/11 14:48
 *
 * 二叉树的最大深度
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int l = maxDepth(root.left);
            int r = maxDepth(root.right);
            return (l > r ? l : r) + 1;
        }
    }
}
