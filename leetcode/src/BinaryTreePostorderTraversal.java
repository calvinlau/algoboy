import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the postorder traversal of its nodes' values.
 *
 * @author calvinliu
 * @Solution: Recursion
 */
public class BinaryTreePostorderTraversal {

    private final List<Integer> ret = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return ret;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        ret.add(root.val);
        return ret;
    }
}
