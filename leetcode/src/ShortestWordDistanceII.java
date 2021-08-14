import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is a follow up of Shortest Word Distance. The only difference is now you
 * are given the list of words and your method will be called repeatedly many
 * times with different parameters. How would you optimize it?
 * 
 * Design a class which receives a list of words in the constructor, and
 * implements a method that takes two words word1 and word2 and return the
 * shortest distance between these two words in the list.
 * 
 * For example, Assume that words = ["practice", "makes", "perfect", "coding",
 * "makes"].
 * 
 * Given word1 = “coding”, word2 = “practice”, return 3. Given word1 = "makes",
 * word2 = "coding", return 1.
 * 
 * @author calvinliu
 * @Solution
 */
public class ShortestWordDistanceII {

	public class WordDistance {

		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();

		public WordDistance(String[] words) {
			for (int i = 0; i < words.length; i++) {
				List<Integer> cnt = map.get(words[i]);
				if (cnt == null) {
					cnt = new ArrayList<Integer>();
				}
				cnt.add(i);
				map.put(words[i], cnt);
			}
		}

		public int shortest(String word1, String word2) {
			List<Integer> i1 = map.get(word1);
			List<Integer> i2 = map.get(word2);
			int distance = Integer.MAX_VALUE;
			int i = 0, j = 0;
			while (i < i1.size() && j < i2.size()) {
				distance = Math.min(Math.abs(i1.get(i) - i2.get(j)), distance);
				if (i1.get(i) < i2.get(j)) {
					i++;
				} else {
					j++;
				}
			}
			return distance;
		}
	}
}
