package map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 *
 * @author kevinliu
 * @Solution: HashMap for storing
 * 
 */
public class IntersectionofTwoArrays {

	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> nums1Set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for (int num : nums1) {
			nums1Set.add(num);
		}
		for (int num : nums2) {
			if (nums1Set.contains(num)) {
				list.add(num);
				nums1Set.remove(num);
			}
		}
		int[] ret = new int[list.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = list.get(i);
		}
		return ret;
	}
}
