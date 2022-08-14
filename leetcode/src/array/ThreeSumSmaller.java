package array;

import java.util.Arrays;

/**
 * Given an array of n integers nums and a target, find the number of index
 * triplets i, j, k with 0 <= i < j < k < n that satisfy the condition nums[i] + nums[j] + nums[k] < target.
 * 
 * For example, given nums = [-2, 0, 1, 3], and target = 2.
 * 
 * Return 2. Because there are two triplets which sums are less than 2:
 * 
 * [-2, 0, 1] [-2, 0, 3]
 * 
 * @author kevinliu
 * @Solution: Sort array firstly, then using two pointer left+right to search.
 * 
 */
public class ThreeSumSmaller {

	public int threeSumSmaller(int[] nums, int target) {
		Arrays.sort(nums);
		int cnt = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1, right = nums.length - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum >= target) {
					right--;
				} else {
					cnt += right - left;
					left++;
				}
			}
		}
		return cnt;
	}
}
