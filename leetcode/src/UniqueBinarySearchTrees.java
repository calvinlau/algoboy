/**
 * Given n, how many structurally unique BST's (binary search trees) that store
 * values 1...n?
 * 
 * For example, Given n = 3, there are a total of 5 unique BST's.
 * 
 * @author calvinliu
 * @Solution DP num[i] = num[i] + num[j] * num[i - j - 1];
 * 
 */
public class UniqueBinarySearchTrees {


	public int numTrees(int n) {
		int[] count = new int[n + 1];
		count[0] = 1;
		count[1] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				count[i] += count[j] * count[i - j - 1];
			}
		}
		return count[n];
	}
}
