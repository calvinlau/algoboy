package map;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 *
 * Input: s = "loveleetcode"
 * Output: 2
 *
 * @author kevinliu
 * @Solution: HashMap for storing
 * 
 */
public class FirstUniqueCharacterinaString {

	//O(N)time
	//O(1)space
	public int firstUniqChar(String s) {
		char[] arr = s.toCharArray();
		int[] count = new int[26];
		for (char c : arr) {
			count[c - 'a']++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (count[arr[i] - 'a'] == 1) return i;
		}
		return -1;
	}
}
