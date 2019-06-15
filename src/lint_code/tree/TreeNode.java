package lint_code.tree;

/**
 * @author wjianwu 2019/6/14 15:52
 */
class TreeNode {

    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
