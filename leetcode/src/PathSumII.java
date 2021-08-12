import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 * 
 * For example:
 * Given the below binary tree and sum = 22,
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 * return
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 * 
 * @author CalvinLiu
 * @Solution Divide and conquer
 * 
 */
public class PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> ret = new ArrayList<List<Integer>>();
    	List<Integer> path = new ArrayList<Integer>();
    	pathSum(ret, path, root, sum);
    	return ret;
    }

	private void pathSum(List<List<Integer>> ret, List<Integer> path, TreeNode root, int sum) {
		if (root == null) {
			return;
		}
		path.add(root.val);
		if (root.left == null && root.right == null && root.val == sum) {
			List<Integer> tmp = new ArrayList<Integer>(path);
			ret.add(tmp);
		}
		pathSum(ret, path, root.left, sum - root.val);
		pathSum(ret, path, root.right, sum - root.val);
		path.remove(path.size() - 1);
	}
}
