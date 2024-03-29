/**
 * Given a non-empty binary search tree and a target value, find the value in
 * the BST that is closest to the target.
 *
 * @author calvinliu
 * @Solution Divide and conquer
 * 
 */
public class ClosestBinarySearchTreeValue {
    public int closestValue_1(TreeNode root, double target) {
        // 选出子树的根节点
        TreeNode kid = target < root.val ? root.left : root.right;
        // 如果没有子树，也就是递归到底时，直接返回当前节点值
        if(kid == null) return root.val;
        // 找出子树中最近的那个节点
        int closest = closestValue_1(kid, target);
        // 返回根节点和子树最近节点中，更近的那个节点
        return Math.abs(root.val - target) < Math.abs(closest - target) ? root.val : closest;
    }
    
	public int closestValue_2(TreeNode root, double target) {
		int closest = root.val;
		while (root != null) {
			// 如果该节点的离目标更近，则更新到目前为止的最近值
			closest = Math.abs(closest - target) < Math.abs(root.val - target) ? closest : root.val;
			// 二叉搜索
			root = target < root.val ? root.left : root.right;
		}
		return closest;
	}
}
