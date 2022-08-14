package array;

/**
 * Given a sorted array, remove the duplicates in place such that each element
 * appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with
 * constant memory.
 * 
 * For example, Given input array A = [1,1,2],
 * 
 * Your function should return length = 2, and A is now [1,2].
 * 
 * @author kevinliu
 * @Solution: Put
 * 
 */
public class RemoveDuplicatesfromSortedArray {

	public int removeDuplicates(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i == 0 || nums[i] != nums[count - 1]) {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
	}
}
