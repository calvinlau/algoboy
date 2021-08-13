import java.util.Arrays;

/**
 * There are N children standing in a line. Each child is assigned a rating
 * value.
 * 
 * You are giving candies to these children subjected to the following
 * requirements:
 * 
 * Each child must have at least one candy. Children with a higher rating get
 * more candies than their neighbors. What is the minimum candies you must give?
 * 
 * @author calvinliu
 * @solution travel from left to right, then right to left, count the total.
 * 
 */
public class Candy {

    public int candy(int[] ratings) {
    	int[] candy = new int[ratings.length];
    	Arrays.fill(candy, 1);
		for (int i = 1; i < ratings.length; i++) {
			if (ratings[i - 1] < ratings[i]) {
				candy[i] = candy[i - 1] + 1;
			}
		}
		for (int i = ratings.length - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1] && candy[i] <= candy[i + 1]) {
				candy[i] = candy[i + 1] + 1;
			}
		}
		int ret = 0;
    	for (int i = 0; i < candy.length; i++) {
			ret += candy[i];
		}
		return ret;
    }
}
