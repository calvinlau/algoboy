/**
 * Given n non-negative integers representing an elevation map where the width
 * of each bar is 1, compute how much water it is able to trap after raining.
 * 
 * For example, Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 * 
 * @author calvinliu
 * 
 */
public class TrappingRainWater {

    public int trap(int[] height) {
    	if (height == null || height.length < 3) return 0;
    	int sum = 0;
    	int[] leftMax = new int[height.length], rightMax = new int[height.length];
    	leftMax[0] = height[0];
    	rightMax[height.length - 1] = height[height.length - 1];
    	for (int i = 1; i < height.length; i++) {
    		leftMax[i] = Math.max(leftMax[i - 1], height[i]);
    		rightMax[height.length - i - 1] = Math.max(rightMax[height.length - i], height[height.length - i - 1]);
		}
    	for (int i = 0; i < height.length; i++) {
    		sum += Math.min(leftMax[i], rightMax[i]) - height[i];
		}
		return sum;
    }
}
