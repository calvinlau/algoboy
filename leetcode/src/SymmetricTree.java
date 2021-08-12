/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *
 * @author calvinliu
 * @Solution Divide and conquer
 * 
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return check (root.left, root.right);
    }

    public boolean check(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null)
			return true;
		if (t1 == null && t2 != null || t1 != null && t2 == null || t1.val != t2.val)
			return false;
		return check(t1.left, t2.right) && check(t1.right, t2.left);
    }
}
