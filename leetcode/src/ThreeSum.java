import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a +
 * b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * 
 * Note: Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤
 * b ≤ c) The solution set must not contain duplicate triplets. For example,
 * given array S = {-1 0 1 2 -1 -4},
 * 
 * A solution set is: 
 * (-1, 0, 1) 
 * (-1, -1, 2)
 * 
 * @author calvinliu
 * @Solution: 1. Simplify '3sum' to '2sum', using map to store data O(n^2) 
 *            2. Simplify '3sum' to '2sum', sort array firstly, then using two pointer left+right to search. 
 */
public class ThreeSum {

	public static void main(String[] args) {
		int[] num = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
		System.out.println(new ThreeSum().threeSum_2(num));
	}

    public List<List<Integer>> threeSum_1(int[] nums) {
    	Set<List<Integer>> ret = new HashSet<List<Integer>>();
    	if (nums == null || nums.length < 3) {
    		return new ArrayList<List<Integer>>(ret);
    	}
    	for (int i = 0; i < nums.length; i++) {
    		List<Integer> triplet = new ArrayList<Integer>();
    		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
    		int target = 0 - nums[i];
			for (int j = 0; j < nums.length; j++) {
				if (j == i) continue;
				if (map.get(nums[j]) == null) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(j);
					map.put(nums[j], list);
				}
				if (map.get(target - nums[j]) != null && map.get(target - nums[j]).get(0) < j) {
					triplet.add(0 - target);
					triplet.add(nums[j]);
					triplet.add(nums[map.get(target - nums[j]).get(0)]);
					Collections.sort(triplet);
					if (!ret.contains(triplet)) {
						ret.add(triplet);
					}
					triplet = new ArrayList<Integer>();
				}
			}
		}
    	return new ArrayList<List<Integer>>(ret);
    }

    public List<List<Integer>> threeSum_2(int[] nums) {
    	List<List<Integer>> ret = new ArrayList<List<Integer>>();
    	Arrays.sort(nums);
    	for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
    		int target = 0 - nums[i];
    		int l = i + 1, r = nums.length - 1;
    		while (l < r) {
    			int sum = nums[l] + nums[r];
    			if (sum > target) {
    				r--;
    			} else if (sum < target) {
    				l++;
    			} else {
    				List<Integer> triplet = new ArrayList<Integer>();
    				triplet.add(nums[i]);
    				triplet.add(nums[l]);
    				triplet.add(nums[r]);
    				ret.add(triplet);
    				l++;
    				r--;
					while (l < r && nums[l] == nums[l - 1]) {
						l++;
					}
					while (l < r && nums[r] == nums[r + 1]) {
						r--;
					}
    			}
    		}
    	}
    	return ret;
    }
}
