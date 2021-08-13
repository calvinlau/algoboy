/**
 * Given an array and a value, remove all instances of that value in place and
 * return the new length.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length.
 * 
 * @author calvinliu
 * @Solution: Two point start from index 0, if not equals val then p++
 * 
 */
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		if (nums.length == 0)
			return 0;
		else {
			int p = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] != val) {
					nums[p++] = nums[i];
				}
			}
			return p;
		}
    }
}
