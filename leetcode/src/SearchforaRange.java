/**
 * Given a sorted array of integers, find the starting and ending position of a
 * given target value.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * If the target is not found in the array, return [-1, -1].
 * 
 * For example, Given [5, 7, 7, 8, 8, 10] and target value 8, return [3, 4].
 * 
 * @author calvinliu
 * @Solution: Binary search, get higher and lower range. O(log n)
 */
public class SearchforaRange {

	public int[] searchRange(int[] nums, int target) {
		int left = 0, right = nums.length - 1;
		int low, high;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		low = left;
		left = 0;
		right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		high = right;
		if (low <= high) {
			return new int[]{low, high};
		}
		return new int[]{-1, -1};
	}
}
