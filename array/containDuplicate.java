/*
 * Given an integer array nums, return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
package array;

import java.util.HashSet;

public class containDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 };
        System.out.println(containsDuplicate(nums));
    }   
    public static boolean containsDuplicate (int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;

            }
            set.add(nums[i]);
        }

        return false;
    }
}
