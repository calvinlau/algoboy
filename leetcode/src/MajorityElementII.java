import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an integer array of size n, find all elements that appear more than ⌊
 * n/3 ⌋ times. The algorithm should run in linear time and in O(1) space.
 * 
 * @author kevinliu
 * @solution counter for 2 majority
 */
public class MajorityElementII {

	public static void main(String[] args) {
		System.out.println(majorityElement(new int[]{3, 3, 4}));
	}

	public static List<Integer> majorityElement(int[] nums) {
		List<Integer> ret = new ArrayList<>();
		int count1 = 0, major1 = 0, count2 = 0, major2 = 0;
		for (int num : nums) {
			if (major1 == num) {
				count1++;
			} else if (major2 == num) {
				count2++;
			} else if (count1 == 0) {
				major1 = num;
				count1++;
			} else if (count2 == 0) {
				major2 = num;
				count2++;
			} else {
				count1--;
				count2--;
			}
		}
		count1 = 0;
		count2 = 0;
		for (int num : nums) {
			if (major1 == num) {
				count1++;
			} else if (major2 == num) {
				count2++;
			}
		}
		if (count1 > nums.length / 3) {
			ret.add(major1);
		}
		if (count2 > nums.length / 3) {
			ret.add(major2);
		}
		return ret;
	}

    public List<Integer> majorityElement_1(int[] nums) {
    	List<Integer> ret = new ArrayList<>();
    	if (nums == null || nums.length == 0) {
    		return ret;
    	}
    	Map<Integer, Integer> map = new HashMap<>();
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
}
