package search;

/**
 * 81. Search in Rotated Sorted Array II
 *
 * Input: nums = [2,5,6,0,0,1,2], target = 0
 * Output: true
 *
 * Follow up for "Search in Rotated Sorted Array": What if duplicates are allowed?
 * 
 * Would this affect the run-time complexity? How and why?
 * 
 * Write a function to determine if a given target is in the array.
 * 
 * @author calvinliu
 * @solution binary search
 * 
 */
public class SearchinRotatedSortedArrayII {

	public boolean search(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (nums[mid] == target) {
				return true;
			} else if (nums[mid] > nums[left]) {
				if (nums[left] <= target && target < nums[mid]) {
					right = mid;
				} else {
					left = mid;
				}
			} else if (nums[mid] < nums[left]) {
				if (nums[mid] < target && target <= nums[right]) {
					left = mid;
				} else {
					right = mid;
				}
			} else {
				if (nums[left] == nums[right]) {
					left++;
					right--;
				} else {
					left = mid + 1;
				}
			}
		}
		return false;
	}
}
