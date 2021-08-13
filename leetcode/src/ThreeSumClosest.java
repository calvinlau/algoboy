import java.util.Arrays;

/**
 * Given an array S of n integers, find three integers in S such that the sum is
 * closest to a given number, target. Return the sum of the three integers. You
 * may assume that each input would have exactly one solution.
 * 
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * 
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 * @author calvinliu
 * @Solution: 1. Simplify '3sum' to '2sum', sort array firstly, then using two pointer left+right to search. 
 * 
 */
public class ThreeSumClosest {

	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int ret = 0, minDiff = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int l = i + 1, r = nums.length - 1;
			while (l < r) {
				int sum = nums[i] + nums[l] + nums[r];
				if (Math.abs(target - sum) < minDiff) {
					minDiff = Math.abs(target - sum);
					ret = sum;
				}
				if (sum < target) {
					l++;
				} else if (sum > target) {
					r--;
				} else {
					return sum;
				}
			}
		}
		return ret;
	}









    public int threeSumClosest_1(int[] nums, int target) {
        int ret = 0;
    	if (nums == null || nums.length < 3) {
    		return ret;
    	}
        int mindiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
    	for (int i = 0; i < nums.length - 2; i++) {
			int l = i + 1, r = nums.length - 1;
    		while (l < r) {
    			int sum = nums[i] + nums[l] + nums[r];
    			if (Math.abs(target - sum) < mindiff) {
    				mindiff = Math.abs(target - sum);
    				ret = sum;
    			}
    			if (sum < target) {
    				l++;
    			} else if (sum > target){
    				r--;
    			} else {
    				return sum;
    			}
    		}
		}
    	return ret;
    }
}
