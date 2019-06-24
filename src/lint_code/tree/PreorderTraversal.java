package lint_code.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjianwu 2019/6/11 14:05
 *
 * 先序遍历
 */
public class PreorderTraversal {

    private List<Integer> arrayList = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        arrayList.add(root.val);
        if (root.left != null) {
            preorderTraversal(root.left);
        }
        if (root.left != null) {
            preorderTraversal(root.right);
        }
        return arrayList;
    }
}
