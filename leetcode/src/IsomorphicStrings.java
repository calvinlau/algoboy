import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character but a character may map to itself.
 * 
 * For example, 
 * Given "egg", "add", return true.
 * Given "foo", "bar", return false.
 * Given "paper", "title", return true.
 * 
 * @author calvinliu
 * @Solution HashMap
 */
public class IsomorphicStrings {

	public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				if (t.charAt(i) == map.get(s.charAt(i)))
					continue;
				else
					return false;
			} else if (map.containsValue(t.charAt(i)))
				return false;
			map.put(s.charAt(i), t.charAt(i));
		}
		return true;
	}
}
