package array;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 *
 * @author kevinliu
 * 
 */
public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int end1 = m - 1, end2 = n - 1, i = nums1.length - 1;
		while (end1 >= 0 && end2 >= 0) {
			if (nums1[end1] > nums2[end2]) {
				nums1[i--] = nums1[end1--];
			} else {
				nums1[i--] = nums2[end2--];
			}
		}
		while (end2 >= 0) {
			nums1[i--] = nums2[end2--];
		}
	}
}
