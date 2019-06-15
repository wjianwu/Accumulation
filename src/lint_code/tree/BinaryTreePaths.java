package lint_code.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjianwu 2019/6/11 15:18
 */
public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        aPath(root, "", list);
        return list;
    }

    public void aPath(TreeNode root, String string, List<String> list) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            aPath(root.left, string + root.val + "->", list);
        }
        if (root.right != null) {
            aPath(root.right, string + root.val + "->", list);
        }
        if (root.left == null && root.right == null) {
            list.add(string + root.val);
        }
    }
}
