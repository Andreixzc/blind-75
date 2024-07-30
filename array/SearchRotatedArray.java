package array;

public class SearchRotatedArray {
    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 5, 13, 15, 16 };
        // 5 1 3
        System.out.println(search(array, 16));
    }

    public static int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }


    public static int search(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[left] <= nums[mid]) {
            if (target >= nums[left] && target <= nums[mid]) {
                return search(nums, left, mid - 1, target);
            }
            return search(nums, mid + 1, right, target);

        } else {
            if (target >= nums[mid] && target <= nums[right]) {
                return search(nums, mid + 1, right, target);
            }
            return search(nums, left, mid - 1, target);
        }
    }
}
