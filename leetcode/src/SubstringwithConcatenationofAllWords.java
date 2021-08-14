import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * You are given a string, S, and a list of words, L, that are all of the same
 * length. Find all starting indices of substring(s) in S that is a
 * concatenation of each word in L exactly once and without any intervening
 * characters.
 * 
 * For example, given: S: "barfoothefoobarman" L: ["foo", "bar"]
 * 
 * You should return the indices: [0,9].
 * 
 * @author calvinliu
 * 
 */
public class SubstringwithConcatenationofAllWords {
	public static void main(String[] args) {
		String[] L = {"foo", "bar"};
		System.out.println(new SubstringwithConcatenationofAllWords().findSubstring("barfoothefoobarman", L));
	}
	
	public List<Integer> findSubstring(String S, String[] L) {
		List<String> set = new ArrayList<String>();
		List<Integer> ret = new ArrayList<Integer>();
		if (L.length == 0 || S == null || S.length() == 0) return ret;
		for (int i = 0; i < L.length; i++) {
			set.add(L[i]);
		}
		Map<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < S.length() - L[0].length() + 1; i++) {
			map.put(i, S.substring(i, i + L[0].length()));
		}
		List<String> tmpList = new ArrayList<String>(set);
		int first = 0;
		for (int i = 0; i < map.size(); i++) {
			if (tmpList.contains(map.get(i))) {
				if (tmpList.size() == set.size()) {
					first = i;
				}
				tmpList.remove(map.get(i));
			} else {
				i = first;
			}
			if (tmpList.size() == 0) {
				tmpList = new ArrayList<String>(set);
				ret.add(first);
				int tmp = first;
				first = i;
				i = tmp;
			}
		}
//		for (Entry<Integer, String> entry : map.entrySet()) {
//			if (tmpList.contains(entry.getValue())) {
//				if (tmpList.size() == set.size()) {
//					first = entry.getKey();
//				}
//				tmpList.remove(entry.getValue());
//			}
//			if (tmpList.size() == 0) {
//				tmpList = new ArrayList<String>(set);
//				ret.add(first);
//				first = entry.getKey();
//			}
//		}
		return ret;
	}
	
	public static List<Integer> findSubstring_2(String S, String[] L) {
		List<Integer> res = new ArrayList<Integer>();
		if (S == null || L == null || L.length == 0)
			return res;
		int len = L[0].length();

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String w : L)
			map.put(w, map.containsKey(w) ? map.get(w) + 1 : 1);

		for (int i = 0; i <= S.length() - len * L.length; i++) {
			Map<String, Integer> copy = new HashMap<String, Integer>(map);
			for (int j = 0; j < L.length; j++) {
				String str = S.substring(i + j * len, i + j * len + len);
				if (copy.containsKey(str)) {
					int count = copy.get(str);
					if (count == 1)
						copy.remove(str);
					else
						copy.put(str, count - 1);
					if (copy.isEmpty()) {
						res.add(i);
						break;
					}
				} else
					break;
			}
		}
		return res;
	}
}
