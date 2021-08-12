import java.util.ArrayList;
import java.util.List;

/**
 * 
 * The set [1,2,3,…,n] contains a total of n! unique permutations.
 * 
 * By listing and labeling all of the permutations in order, We get the
 * following sequence (ie, for n = 3):
 * 
 * "123" "132" "213" "231" "312" "321" 
 * 
 * Given n and k, return the kth permutation sequence.
 * 
 * Note: Given n will be between 1 and 9 inclusive.
 * 
 * @author calvinliu
 * @solution DFS
 * 
 */
public class PermutationSequence {

	public String getPermutation_1(int n, int k) {
		List<String> ret = new ArrayList<String>();
		String path = "";
		boolean[] flag = new boolean[n];
		dfs(ret, path, n, k, flag);
		return ret.get(k - 1);
	}

	private void dfs(List<String> ret, String path, int n, int k, boolean[] flag) {
		if (path.length() == n) {
			ret.add(path);
			if (ret.size() == k) {
				return;
			}
		}
		for (int i = 1; i <= n; i++) {
			if (!flag[i - 1]) {
				flag[i - 1] = true;
				path += i;
				dfs(ret, path, n, k, flag);
				path = path.substring(0, path.length() - 1);
				flag[i - 1] = false;
			}
		}
	}
	
	public String getPermutation_2(int n, int k) {
		List<Integer> numbers = new ArrayList<>();
		int[] factorial = new int[n + 1];
		StringBuilder sb = new StringBuilder();

		// create an array of factorial lookup
		int sum = 1;
		factorial[0] = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
			factorial[i] = sum;
		}
		// factorial[] = {1, 1, 2, 6, 24, ... n!}

		for (int i = 1; i <= n; i++) {
			numbers.add(i);
		}

		k--;
		for (int i = 1; i <= n; i++) {
			int index = k / factorial[n - i];
			sb.append(String.valueOf(numbers.get(index)));
			numbers.remove(index);
			k -= index * factorial[n - i];
		}
		return String.valueOf(sb);
	}
}
