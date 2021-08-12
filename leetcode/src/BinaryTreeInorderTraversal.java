import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * @author calvinliu
 * @Solution: Recursion
 */
public class BinaryTreeInorderTraversal {

    private final List<Integer> ret = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return ret;
        }
        inorderTraversal(root.left);
        ret.add(root.val);
        inorderTraversal(root.right);
        return ret;
    }
}
