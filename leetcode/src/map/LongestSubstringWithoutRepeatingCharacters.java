package map;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * @author kevinliu
 * 
 */
public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		int[] map = new int[128];
		int ret = 0;
		int end = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			end = Math.max(end, map[c]);
			ret = Math.max(ret, i + 1 - end);
			map[c] = i + 1;
		}
		return ret;
	}
}
