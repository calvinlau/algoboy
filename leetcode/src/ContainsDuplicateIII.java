import java.util.TreeSet;

/**
 * Given an array of integers, find out whether there are two distinct indices i
 * and j in the array such that the difference between nums[i] and nums[j] is at
 * most t and the difference between i and j is at most k.
 * 
 * @author kevinliu
 * @Solution: The floor(x) returns the greatest value that is less than x. The ceiling(x) returns the least value that is greater than x.
 * 
 */
public class ContainsDuplicateIII {

	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if (k < 1 || t < 0)
			return false;
		TreeSet<Integer> set = new TreeSet<>();

		for (int i = 0; i < nums.length; i++) {
			int c = nums[i];
			if ((set.floor(c) != null && c <= set.floor(c) + t) || (set.ceiling(c) != null && c >= set.ceiling(c) - t)) {
				return true;
			}
			set.add(c);
			if (i >= k) {
				set.remove(nums[i - k]);
			}
		}
		return false;
	}
}
