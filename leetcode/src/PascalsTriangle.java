import java.util.ArrayList;
import java.util.List;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 * 
 * For example, given numRows = 5, Return
 * 
 * [ 
 *      [1], 
 *     [1,1], 
 *    [1,2,1], 
 *   [1,3,3,1], 
 *  [1,4,6,4,1] 
 * ]
 * 
 * @author CalvinLiu
 * @author Create array from top
 * 
 */
public class PascalsTriangle {

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ret = new ArrayList<>();
		List<Integer> row, pre = null;
		for (int i = 0; i < numRows; i++) {
			row = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					row.add(1);
				} else {
					row.add(pre.get(j) + pre.get(j - 1));
				}
			}
			pre = row;
			ret.add(row);
		}
		return ret;
	}
}
