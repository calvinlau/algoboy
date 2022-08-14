package array;

/**
 * Follow up for "Remove Duplicates": What if duplicates are allowed at most
 * twice?
 * 
 * For example, Given sorted array A = [1,1,1,2,2,3],
 * 
 * Your function should return length = 5, and A is now [1,1,2,2,3].
 * 
 * @author kevinliu
 * @solution two pointer
 * 
 */
public class RemoveDuplicatesfromSortedArrayII {

	public int removeDuplicates(int[] nums) {
		if (nums.length <= 2) {
			return nums.length;
		}
		int count = 2;
		for (int i = count; i < nums.length; i++) {
			if (nums[i] != nums[count - 2]) {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
	}
}
