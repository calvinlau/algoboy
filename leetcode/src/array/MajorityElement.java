package array;

/**
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than n/2 times. You may assume that the
 * array is non-empty and the majority element always exist in the array.
 * 
 * @author kevinliu
 * @solution hash map store element and counter, O(N)
 */
public class MajorityElement {

	public int majorityElement(int[] nums) {
		int count = 0, major = 0;
		for (int num : nums) {
			if (count == 0) {
				major = num;
				count++;
			} else if (major == num) {
				count++;
			} else {
				count--;
			}
		}
		return major;
	}
}
