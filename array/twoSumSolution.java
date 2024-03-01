/*
 * describe two sum problem: 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 */
package array;

import java.util.HashMap;

public class twoSumSolution {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        twoSumSolution solution = new twoSumSolution();
        int[] result = solution.twoSum(nums, target);

        for (int i : result) {
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }
}
