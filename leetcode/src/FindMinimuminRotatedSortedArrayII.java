/**
 * Follow up for "Find Minimum in Rotated Sorted Array": What if duplicates are
 * allowed?
 * 
 * Would this affect the run-time complexity? How and why? Suppose a sorted
 * array is rotated at some pivot unknown to you beforehand.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * Find the minimum element.
 * 
 * The array may contain duplicates.
 * 
 * @author calvinliu
 * @solution binary search
 * 
 */
public class FindMinimuminRotatedSortedArrayII {

	public int findMin(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int left = 0;
		int right = nums.length - 1;
		while (left < right && nums[left] >= nums[right]) {
			int mid = (left + right) / 2;
			if (nums[mid] > nums[right]) {
				left = mid + 1;
			} else if (nums[mid] < nums[right]) {
				right = mid;
			} else {
				left++;
			}
		}
		return nums[left];
	}
}
