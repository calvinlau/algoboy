/**
 * Given an array where elements are sorted in ascending order, convert it to a
 * height balanced BST.
 * 
 * @author calvinliu
 * @Solution Find middle, convert left and right recursively
 * 
 */
public class ConvertSortedArraytoBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
    	return sortedArrayToBSTDFS(nums, 0, nums.length - 1);
    }

	private TreeNode sortedArrayToBSTDFS(int[] num, int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(num[mid]);
		root.left = sortedArrayToBSTDFS(num, start, mid - 1);
		root.right = sortedArrayToBSTDFS(num, mid + 1, end);
		return root;
	}
}
