import java.util.ArrayList;
import java.util.List;

/**
 * Given a string of numbers and operators, return all possible results from
 * computing all the different possible ways to group numbers and operators. The
 * valid operators are +, - and *.
 * 
 * @author calvinliu
 * @solution Divide and Conquer
 * 
 */
public class DifferentWaystoAddParentheses {

	public List<Integer> diffWaysToCompute(String input) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c != '+' && c != '-' && c != '*') {
				continue;
			}
			List<Integer> left = diffWaysToCompute(input.substring(0, i));
			List<Integer> right = diffWaysToCompute(input.substring(i + 1, input.length()));
			for (int l : left) {
				for (int r : right) {
					if (c == '+') {
						result.add(l + r);
					} else if (c == '-') {
						result.add(l - r);
					} else if (c == '*') {
						result.add(l * r);
					}
				}
			}
		}
		if (result.size() == 0) { // when there is only an integer
			result.add(Integer.parseInt(input));
		}
		return result;
	}
}
