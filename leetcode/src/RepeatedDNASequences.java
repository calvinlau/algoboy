import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T,
 * for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to
 * identify repeated sequences within the DNA.
 * 
 * Write a function to find all the 10-letter-long sequences (substrings) that
 * occur more than once in a DNA molecule.
 * 
 * For example,
 * 
 * Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",
 * 
 * Return: ["AAAAACCCCC", "CCCCCAAAAA"].
 * 
 * @author calvinliu
 * @solution 1. Using Map, Memory Limit Exceeded
 *           2. Change map's String to Integer
 * 
 */
public class RepeatedDNASequences {

	public static void main(String[] args) {
		System.out.println(new RepeatedDNASequences().findRepeatedDnaSequences_1("AAAAAAAAAAAA"));
	}

    public List<String> findRepeatedDnaSequences_1(String s) {
    	if (s == null) return null;
    	Map<String, Integer> map = new HashMap<String, Integer>();
    	List<String> ret = new ArrayList<String>(); 
    	for (int i = 0; i < s.length() - 9; i++) {
    		String tmp = s.substring(i, i + 10);
    		Integer count = null;
			if (map.containsKey(tmp)) {
				count = map.get(tmp) + 1;
				ret.add(tmp);
			} else {
				count = 1;
			}
			map.put(tmp, count);
		}
		return ret;
    }
    
    public List<String> findRepeatedDnaSequences_2(String s) {
    	if (s == null) return null;
    	List<String> ret = new ArrayList<String>();
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < s.length() - 9; i++) {
    		Integer key = toInt(s.substring(i, i + 10));
    		Integer count = null;
    		if (map.containsKey(key)) {
    			if (map.get(key) == 1)
    				ret.add(s.substring(i, i + 10));
    			count = map.get(key) + 1;
    		} else {
    			count = 1;
    		}
    		map.put(key, count);
    	}
    	return ret;
    }
    
    private int toInt(char c) {
    	if (c == 'A') return 0;
    	if (c == 'C') return 1;
    	if (c == 'T') return 2;
    	return 3;
    }

    private int toInt(String s) {
    	int res = 0;
    	for (int i = 0; i < s.length(); i++) {
    		res <<= 2;
    		res |= toInt(s.charAt(i));
		}
    	return res;
    }
}
