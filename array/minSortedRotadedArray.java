package array;

public class minSortedRotadedArray {
    public static void main(String[] args) {

    }

    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length;
        int mid = nums.length / 2;
        while (l > r) {
            if (nums[mid] > nums[mid - 1]) {
                // maior ta pra direita
                l = mid;

            } else {
                // maior ta pra esquerda
            }
        }
        return 0;
    }

}
