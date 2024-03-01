/*
You are given an integer array height of length n. 
There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and 
(i, height[i]).
Time complexity: O(n)
Space Complexity: O(1)
*/
package array;

public class containerMostWater {
    public static void main(String[] args) {

    }

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int currentMax = -1;

        while (i < j) {
            int currentArea = Math.min(height[i], height[j]) * (j - i);
            currentMax = Math.max(currentArea, currentMax);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }

        }
        return currentMax;
    }

}
