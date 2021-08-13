/**
 * Given an unsorted integer array, find the first missing positive integer.
 * 
 * For example, 
 * Given [1,2,0] return 3, 
 * and [3,4,-1,1] return 2.
 * 
 * Your algorithm should run in O(n) time and uses constant space.
 * 
 * @author calvinliu
 * @Solution: First loop make the array like a[i] = i + 1, 
 * the second loop is using for search position doesn't match the rules.
 * 
 */
public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
			while (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[nums[i] - 1]) {
				swap(nums, i, nums[i] - 1);
			}
		}
        int i;
        for (i = 0; i < nums.length; i++) {
        	if (nums[i] != i + 1) {
				break;
			}
		}
    	return i + 1;
    }

	private void swap(int[] a, int i, int j) {
		int tmp = a[j];
		a[j] = a[i];
		a[i] = tmp;
	}
}
