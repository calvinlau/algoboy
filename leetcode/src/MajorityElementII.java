import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an integer array of size n, find all elements that appear more than ⌊
 * n/3 ⌋ times. The algorithm should run in linear time and in O(1) space.
 * 
 * @author calvinliu
 * @solution counter for 2 majority
 */
public class MajorityElementII {

    public List<Integer> majorityElement_1(int[] nums) {
    	List<Integer> ret = new ArrayList<Integer>();
    	if (nums == null || nums.length == 0) {
    		return ret;
    	}
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		if (!map.keySet().contains(nums[i])) {
    			map.put(nums[i], 1);
    		} else {
    			map.put(nums[i], map.get(nums[i]) + 1);
    		}
			if (map.get(nums[i]) > nums.length /3) {
				ret.add(nums[i]);
			}
		}
    	return ret;
    }

	public List<Integer> majorityElement_2(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		Integer n1 = null, n2 = null;
		int c1 = 0, c2 = 0;
		for (int i : nums) {
			if (n1 != null && i == n1.intValue()) {
				c1++;
			} else if (n2 != null && i == n2.intValue()) {
				c2++;
			} else if (c1 == 0) {
				c1 = 1;
				n1 = i;
			} else if (c2 == 0) {
				c2 = 1;
				n2 = i;
			} else {
				c1--;
				c2--;
			}
		}

		c1 = c2 = 0;
		for (int i : nums) {
			if (i == n1.intValue()) {
				c1++;
			} else if (i == n2.intValue()) {
				c2++;
			}
		}
		if (c1 > nums.length / 3)
			result.add(n1);
		if (c2 > nums.length / 3)
			result.add(n2);
		return result;
	}
}
