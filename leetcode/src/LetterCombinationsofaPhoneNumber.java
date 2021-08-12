import java.util.ArrayList;
import java.util.List;

/**
 * Input:Digit string "23" 
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 
 * @author calvinliu
 * @Solution DFS
 * 
 */
public class LetterCombinationsofaPhoneNumber {

    public List<String> letterCombinations(String digits) {
		String[] keyboard = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    	List<String> ret = new ArrayList<String>();
    	if (digits.length()==0) return ret;
    	String path = "";
    	dfs(keyboard, ret, path, digits);
    	return ret;
    }

	private void dfs(String[] keyboard, List<String> ret, String path, String digits) {
		if (digits.length() == path.length()) {
			ret.add(path);
			return;
		}
		String letters = keyboard[digits.charAt(path.length()) - '0'];
		for (int i = 0; i < letters.length(); i++) {
			dfs(keyboard, ret, path + letters.charAt(i), digits);
		}
	}
}
