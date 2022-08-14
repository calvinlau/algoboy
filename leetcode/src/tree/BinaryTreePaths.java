package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. Binary Tree Paths
 *
 * Given a binary tree, return all root-to-leaf paths.
 *
 * @author kevinliu
 * @Solution: DFS
 */
public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ret = new ArrayList<>();
        helper(ret, "", root);
        return ret;
    }

    private void helper(List<String> ret, String path, TreeNode node) {
        if (node == null) {
            return;
        }
        path += node.val;
        if (node.left == null && node.right == null) {
            ret.add(path);
        } else {
            helper(ret, path + "->", node.left);
            helper(ret, path + "->", node.right);
        }
    }
}
