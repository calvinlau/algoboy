package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.
 * Example:
 * Input: The root of a Binary Search Tree like this:
 *    5
 *  /   \
 * 2     13
 * Output: The root of a Greater Tree like this:
 *   18
 *  /   \
 * 20    13
 * @author kevinliu
 * @Solution: Inorder
 */
public class ConvertBSTtoGreaterTree {

    // O(N)time
    // O(D)space
    public TreeNode convertBST(TreeNode root) {
        dfs(root, 0);
        return root;
    }

    int dfs(TreeNode node, int count){
        if(node == null) return count;
        int t = dfs(node.right, count);
        node.val += t;
        return dfs(node.left, node.val);
    }
}
