import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Given a string s and a dictionary of words dict, add spaces in s to construct
 * a sentence where each word is a valid dictionary word.
 * 
 * Return all such possible sentences.
 * 
 * For example, given s = "catsanddog", dict = ["cat", "cats", "and", "sand",
 * "dog"].
 * 
 * A solution is ["cats and dog", "cat sand dog"].
 * 
 * @author calvinliu
 * @solution DFS
 * 
 */
public class WordBreakII {

    public List<String> wordBreak(String s, Set<String> dict) {
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        List<String> l = new ArrayList<String>();
        l.add("");
        map.put(s.length(), l);

        for(int i = s.length() - 1; i >= 0; i--) {
            List<String> values = new ArrayList<String>();
            for(int j = i + 1; j <= s.length(); j++) {
                if (dict.contains(s.substring(i, j))) {
                    for(String word : map.get(j)) {
                        values.add(s.substring(i, j) + (word.isEmpty() ? "" : " ") + word);
                    }
                }
            }
            map.put(i, values);
        }
        return map.get(0);
    }
    
	public ArrayList<String> wordBreak_2(String s, Set<String> dict) {
		return dfs(s, dict, new HashMap<String, ArrayList<String>>());
	}

	public ArrayList<String> dfs(String s, Set<String> dict, Map<String, ArrayList<String>> memo) {
		if (memo.containsKey(s))
			return memo.get(s);
		ArrayList<String> result = new ArrayList<String>();
		int n = s.length();
		if (n <= 0)
			return result;
		for (int len = 1; len <= n; ++len) {
			String subfix = s.substring(0, len);
			if (dict.contains(subfix)) {
				if (len == n) {
					result.add(subfix);
				} else {
					String prefix = s.substring(len);
					ArrayList<String> tmp = dfs(prefix, dict, memo);
					for (String item : tmp) {
						result.add(item = subfix + " " + item);
					}
				}
			}
		}
		memo.put(s, result);
		return result;
	}
}
