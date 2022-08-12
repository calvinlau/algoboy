/**
 * 33. Search in Rotated Sorted Array
 *
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 *
 * You are given a target value to search. If found in the array return its
 * index, otherwise return -1.
 * 
 * You may assume no duplicate exists in the array.
 * 
 * @author kevinliu
 * @solution binary search
 * 
 */
public class SearchinRotatedSortedArray {

    public int search(int[] nums, int target) {
    	if (nums == null || nums.length == 0) {
    		return -1;
    	}
    	int left = 0;
    	int right = nums.length - 1;
    	while (left <= right) {
    		int mid = (left + right) / 2;
    		if (nums[mid] == target) {
    			return mid;
    		} else if (nums[mid] >= nums[left]) {
    			if (nums[left] <= target && target < nums[mid]) {
    				right = mid;
    			} else {
    				left = mid + 1;
    			}
    		} else {
    			if (nums[mid] < target && target <= nums[right]) {
    				left = mid + 1;
    			} else {
    				right = mid;
    			}
    		}
    	}
		return -1;
    }
}
