package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, return the level order traversal of its nodes' values.
 * (ie, from left to right, level by level).
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 * Return:
 * [ [3], [9,20], [15,7] ]
 *
 * @author kevinliu
 * @Solution 1. BFS - Queue
 * @Solution 2. DFS Recursively
 */
public class BinaryTreeLevelOrderTraversal {

    private final List<List<Integer>> ret = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        preOrder(root, 0);
        return ret;
    }

    private void preOrder(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (ret.size() == level) {
            ret.add(new ArrayList<>());
        }
        ret.get(level).add(root.val);
        preOrder(root.left, level + 1);
        preOrder(root.right, level + 1);
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                level.add(head.val);
                if (head.left != null) {
                    queue.offer(head.left);
                }
                if (head.right != null) {
                    queue.offer(head.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}
