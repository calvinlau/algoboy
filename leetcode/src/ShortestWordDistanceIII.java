/**
 * This is a follow up of Shortest Word Distance. The only difference is now
 * word1 could be the same as word2.
 * 
 * Given a list of words and two words word1 and word2, return the shortest
 * distance between these two words in the list.
 * 
 * word1 and word2 may be the same and they represent two individual words in
 * the list.
 * 
 * For example, Assume that words = ["practice", "makes", "perfect", "coding",
 * "makes"].
 * 
 * Given word1 = “makes”, word2 = “coding”, return 1. Given word1 = "makes",
 * word2 = "makes", return 3.
 * 
 * @author calvinliu
 * @Solution
 */
public class ShortestWordDistanceIII {

	public int shortestWordDistance(String[] words, String word1, String word2) {
		int i1 = -1, i2 = -1, distance = Integer.MAX_VALUE, turn = 0, inc = (word1.equals(word2) ? 1 : 0);
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word1) && turn % 2 == 0) {
				i1 = i;
				if (i2 != -1)
					distance = Math.min(distance, i1 - i2);
				turn += inc;
			} else if (words[i].equals(word2)) {
				i2 = i;
				if (i1 != -1)
					distance = Math.min(distance, i2 - i1);
				turn += inc;
			}
		}
		return distance;
	}
}
