/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of line i is at (i, ai) and (i, 0). Find two lines, which together with
 * x-axis forms a container, such that the container contains the most water.
 * 
 */
public class ContainerWithMostWater {

	public int maxArea(int[] height) {
		int max = 0, l = 0, r = height.length - 1;
		while (l < r) {
			int water = (r - l) * Math.min(height[r], height[l]);
			if (water > max) {
				max = water;
			}
			if (height[r] > height[l]) {
				l++;
			} else {
				r--;
			}
		}
		return max;
	}
}
