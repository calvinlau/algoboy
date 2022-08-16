package array;

import java.util.LinkedList;
import java.util.List;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 *
 * Input: n = 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","array.FizzBuzz"]
 *
 * @author kevinliu
 * @Solution
 */
public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
		List<String> ret = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) {
				ret.add("array.FizzBuzz");
			} else if (i % 3 == 0) {
				ret.add("Fizz");
			} else if (i % 5 == 0) {
				ret.add("Buzz");
			} else {
				ret.add(String.valueOf(i));
			}
		}
		return ret;
	}
}

