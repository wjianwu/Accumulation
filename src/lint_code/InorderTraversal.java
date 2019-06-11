package lint_code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjianwu 2019/6/11 11:07
 */
public class InorderTraversal {

    private List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getValue(root, list);
        return list;
    }

    private void getValue(TreeNode root, List<Integer> list) {
        if (root != null) {
            getValue(root.left, list);
            list.add(root.val);
            getValue(root.right, list);
        }
    }
}

class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
