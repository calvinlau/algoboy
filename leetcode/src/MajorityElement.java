import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than n/2 times. You may assume that the
 * array is non-empty and the majority element always exist in the array.
 * 
 * @author calvinliu
 * @solution hash map store element and counter, O(N)
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
    	int ret = 0;
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
			if (map.get(nums[i]) > nums.length /2) {
				ret = nums[i];
				break;
			}
		}
    	return ret;
    }
}
