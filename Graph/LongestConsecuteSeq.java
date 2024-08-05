package Graph;

import java.util.PriorityQueue;

public class LongestConsecuteSeq {
    public static void main(String[] args) {

        int[] nums = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            heap.add(nums[i]);
        }

        int longestSeq = 1;
        int currentSeq = 1;
        int previous = heap.poll();

        while (!heap.isEmpty()) {
            int current = heap.poll();
            if (current == previous) {
                continue;
            } else if (current - previous == 1) {
                currentSeq++;
            } else {
                longestSeq = Math.max(longestSeq, currentSeq);
                currentSeq = 1;
            }
            previous = current;
        }

        return Math.max(longestSeq, currentSeq);
    }

}
