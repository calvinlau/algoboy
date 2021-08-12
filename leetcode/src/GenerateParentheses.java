import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations
 * of well-formed parentheses.
 * 
 * For example, given n = 3, a solution set is:
 * 
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 * 
 * @author calvinliu
 * @solution Divide and Conquer
 * 
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
    	List<String> ret = new ArrayList<String>();
    	dfs(ret, n, n, "");
    	return ret;
    }

	private void dfs(List<String> ret, int left, int right, String str) {
		if (left == 0 && right == 0) {
			ret.add(str);
		}
		if (left > 0) {
			dfs(ret, left - 1, right, str + "(");
		}
		if (left < right) {
			dfs(ret, left, right - 1, str + ")");
		}
	}
}
