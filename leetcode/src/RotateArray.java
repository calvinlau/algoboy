/**
 * Rotate an array of n elements to the right by k steps.
 * 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to
 * [5,6,7,1,2,3,4].
 * 
 * @author calvinliu
 * @solution 
 * 
 */
public class RotateArray {

	public void rotate(int[] nums, int k) {
		if (nums == null || k < 0) {
			return;
		}
		int a = nums.length - k % nums.length;
		reverse(nums, 0, a - 1);
		reverse(nums, a, nums.length - 1);
		reverse(nums, 0, nums.length - 1);
	}

	public void reverse(int[] arr, int left, int right) {
		if (arr == null || arr.length == 1)
			return;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
}
