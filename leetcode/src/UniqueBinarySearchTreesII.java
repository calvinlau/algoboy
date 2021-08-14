import java.util.ArrayList;
import java.util.List;

import com.cloudtale.algo.leetcode.tree.TreeNode;

/**
 * Given n, generate all structurally unique BST's (binary search trees) that
 * store values 1...n. For example, Given n = 3, your program should return all
 * 5 unique BST's shown below.
 *    1         3     3      2      1
       \       /     /      / \      \
        3     2     1      1   3      2
       /     /       \                 \
      2     1         2                 3
 * 
 * @author calvinliu
 * @Solution Recursively get left/right sub tree
 * 
 */
public class UniqueBinarySearchTreesII {
	
	public List<TreeNode> generateTrees(int n) {
		if (n==0) return new ArrayList<TreeNode>() ;
		return generateTrees(1, n);
	}

	private List<TreeNode> generateTrees(int start, int end) {
		List<TreeNode> ret = new ArrayList<TreeNode>(); 
		if (start > end) {
			ret.add(null);
			return ret;
		}
		for (int i = start; i <= end; i++) {
			List<TreeNode> left = generateTrees(start, i - 1);
			List<TreeNode> right = generateTrees(i + 1, end);
			for (TreeNode leftNode : left) {
				for (TreeNode rightNode : right) {
					TreeNode root = new TreeNode(i);
					root.left = leftNode;
					root.right = rightNode;
					ret.add(root);
				}
			}
		}
		return ret;
	}
}
