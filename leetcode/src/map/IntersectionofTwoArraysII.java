package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 *
 * @author kevinliu
 * @Solution: HashMap for storing
 * 
 */
public class IntersectionofTwoArraysII {

	public int[] intersection(int[] nums1, int[] nums2) {
		if (nums1 == null || nums2 == null
				|| nums1.length == 0 || nums2.length == 0) {
			return new int[]{};
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums1) {
			int count = map.getOrDefault(num, 0);
			map.put(num, count + 1);
		}
		List<Integer> list = new ArrayList<>();
		for (int num : nums2) {
			int count = map.getOrDefault(num, 0);
			if (count > 0) {
				list.add(num);
				map.put(num, count - 1);
			}
		}
		int[] ret = new int[list.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = list.get(i);
		}
		return ret;
	}
}
