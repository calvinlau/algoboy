import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Given an array of strings, return all groups of strings that are anagrams.
 * 
 * Note: All inputs will be in lower-case.
 * 
 * @author calvinliu
 * @Solution 
 */
public class Anagrams {

	public List<String> anagrams(String[] strs) {
		List<String> ret = new ArrayList<String>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (int i = 0; i < strs.length; i++) {
			char[] tmp = strs[i].toCharArray();
			Arrays.sort(tmp);
			if (map.containsKey(String.valueOf(tmp))) {
				List<String> list = map.get(String.valueOf(tmp));
				list.add(strs[i]);
			} else {
				List<String> list = new ArrayList<String>();
				list.add(strs[i]);
				map.put(String.valueOf(tmp), list);
			}
		}
		for (Entry<String, List<String>> entry : map.entrySet()) {
			if (entry.getValue().size() > 1) {
				ret.addAll(entry.getValue());
			}
		}
		return ret;
	}
}
