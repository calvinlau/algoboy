import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a collection of numbers that might contain duplicates, return all
 * possible unique permutations.
 * 
 * For example,
 * [1,1,2] have the following unique permutations:
 * [1,1,2], [1,2,1], and [2,1,1].
 *
 * @author calvinliu
 * @solution dfs
 * 
 */
public class PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {
    	Set<List<Integer>> ret = new HashSet<List<Integer>>();
    	List<Integer> path = new ArrayList<Integer>();
    	boolean[] flag = new boolean[nums.length];
    	dfs(ret, path, nums, flag);
    	return new ArrayList<List<Integer>>(ret);
    }

	private void dfs(Set<List<Integer>> ret, List<Integer> path, int[] num, boolean[] flag) {
		if (path.size() == num.length) {
			List<Integer> tmp = new ArrayList<Integer>(path);
			if (!ret.contains(tmp)) {
				ret.add(tmp);
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (!flag[i]) {
				flag[i] = true;
				path.add(num[i]);
				dfs(ret, path, num, flag);
				path.remove(path.size() - 1);
				flag[i] = false;
			}
		}
	}
}
