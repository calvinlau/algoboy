/**
 * Given an unsorted array of integers, find the length of longest increasing
 * subsequence.
 * 
 * For example, Given [10, 9, 2, 5, 3, 7, 101, 18], The longest increasing
 * subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may
 * be more than one LIS combination, it is only necessary for you to return the
 * length.
 * 
 * @author calvinliu
 * @solution 
 * 
 */
public class LongestIncreasingSubsequence {

	public int lengthOfLIS(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int[] dp = new int[nums.length];
		int max = 1;
		for (int i = 0; i < nums.length; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
					max = Math.max(dp[i], max);
				}
			}
		}
		return max;
	}
}
