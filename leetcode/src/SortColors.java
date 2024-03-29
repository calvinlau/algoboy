/**
 * Given an array with n objects colored red, white or blue, sort them so that
 * objects of the same color are adjacent, with the colors in the order red,
 * white and blue.
 * 
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white,
 * and blue respectively.
 * 
 * Note: You are not suppose to use the library's sort function for this
 * problem.
 * 
 * click to show follow up.
 * 
 * Follow up: A rather straight forward solution is a two-pass algorithm using
 * counting sort. First, iterate the array counting number of 0's, 1's, and 2's,
 * then overwrite array with total number of 0's, then 1's and followed by 2's.
 * 
 * Could you come up with an one-pass algorithm using only constant space?
 * 
 * @author calvinliu
 * @solution Two pointers left/right + i, 0 on left, 2 on right
 */
public class SortColors {

    public void sortColors(int[] nums) {
    	if (nums == null || nums.length == 0) return; 
		int l = 0, r = nums.length - 1;
		for (int i = 0; i <= r;) {
			if (nums[i] == 0) {
				nums[i++] = nums[l];
				nums[l++] = 0;
			} else if (nums[i] == 2) {
				nums[i] = nums[r];
				nums[r--] = 2;
			} else {
				i++;
			}
		}
    }
}
