/**
 * Given a string S and a string T, find the minimum window in S which will
 * contain all the characters in T in complexity O(n).
 * 
 * For example, S = "ADOBECODEBANC" T = "ABC" Minimum window is "BANC".
 * 
 * Note: If there is no such window in S that covers all characters in T, return
 * the emtpy string "".
 * 
 * If there are multiple such windows, you are guaranteed that there will always
 * be only one unique minimum window in S.
 * 
 * @author calvinliu
 * 
 */
public class MinimumWindowSubstring {

	public static void main(String[] args) {
		System.out.println(new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "BANC"));
	}

    public String minWindow(String S, String T) {
    	int[] need = new int[256];
    	int[] found = new int[256];
    	for (int i = 0; i < T.length(); i++) {
			need[T.charAt(i)]++;
		}
    	int retStart = -1, retEnd = S.length(), count = 0;
    	for (int start = 0, end = 0; end < S.length(); end++) {
    		if (need[S.charAt(end)] == 0) {
    			continue;
    		}
    		if (found[S.charAt(end)] < need[S.charAt(end)]) {
    			count++;
    		}
    		found[S.charAt(end)]++;
    		if (count != T.length()) continue;
    		// move left
    		for (; start < end; start++) {
    			if (need[S.charAt(start)] == 0) continue;
    			if (found[S.charAt(start)] <= need[S.charAt(start)]) break;
    			found[S.charAt(start)]--;
			}
    		// update result
    		if (retEnd - retStart > end - start) {
    			retStart = start;
    			retEnd = end;
    		}
		}
		return retStart == -1 ? "" : S.substring(retStart, retEnd + 1);
    }
}
