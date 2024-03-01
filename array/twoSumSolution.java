/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
package array;

import java.util.Arrays;
import java.util.HashMap;

public class twoSumSolution {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hash.containsKey(complement)) {
                return new int[] { i, hash.get(complement) };
            }
            hash.put(nums[i], i);

        }
        return new int[] {};

    }

}
