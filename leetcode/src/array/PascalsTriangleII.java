package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an index k, return the kth row of the Pascal's triangle.
 * 
 * For example, given k = 3, Return [1,3,3,1].
 * 
 * Note: Could you optimize your algorithm to use only O(k) extra space?
 * 
 * @author kevinliu
 * @author Create array from top
 * 
 */
public class PascalsTriangleII {
	
	public List<Integer> getRow(int rowIndex) {
		List<Integer> ret = null, pre = null;
		for (int i = 0; i <= rowIndex; i++) {
			ret = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					ret.add(1);
				} else {
					ret.add(pre.get(j) + pre.get(j - 1));
				}
			}
			pre = ret;
		}
		return ret;
	}
}
