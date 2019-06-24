package lint_code.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjianwu 2019/6/11 11:07
 *
 * 中序遍历
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

