package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Design and implement a array.TwoSum class. It should support the following
 * operations: add and find.
 * 
 * add - Add the number to an internal data structure.
 * find - Find if there exists any pair of numbers which sum is equal to the value.
 * 
 * For example,
 * 
 * add(1); 
 * add(3); 
 * add(5); 
 * find(4) -> true 
 * find(7) -> false
 * 
 * @author kevinliu
 * @Solution HashMap as internal storing
 * 
 */
public class TwoSumIII {

	private Map<Integer, Integer> elements = new HashMap<>();
	 
	public void add(int number) {
		if (elements.containsKey(number)) {
			elements.put(number, elements.get(number) + 1);
		} else {
			elements.put(number, 1);
		}
	}
 
	public boolean find(int value) {
		for (Integer i : elements.keySet()) {
			int target = value - i;
			if (elements.containsKey(target)) {
				// if only one element
				if (i == target && elements.get(target) < 2) {
					continue;
				}
				return true;
			}
		}
		return false;
	}
}
