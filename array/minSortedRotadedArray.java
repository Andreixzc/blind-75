package array;

public class minSortedRotadedArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(FindMinbinarySearch(nums, 0, nums.length - 1, nums[0]));
    }

    public static int findMin(int[] nums) {
        return 0;
    }

    public static int binarySearch(int[] nums, int left, int right, int n, int mid) {
        if (left > right) {
            return -1;
        }
        if (nums[mid] == n) {
            return mid;
        } else if (nums[mid] < n) {
            return binarySearch(nums, mid, right, n, (left + right) / 2);
        } else {
            return binarySearch(nums, left, mid, n, (left + right) / 2);
        }

    }

    public static int FindMinbinarySearch(int[] nums, int left, int right, int currentMin) {
        if (left > right) {
            return currentMin;
        }
        int mid = left + (right - left) / 2;
        currentMin = Math.min(currentMin, nums[mid]);
        if (nums[mid] >= nums[left]) {
            if (nums[left] < currentMin) {
                currentMin = nums[left];
            }
            return FindMinbinarySearch(nums, mid + 1, right, currentMin);
        } else {
            return FindMinbinarySearch(nums, left, mid - 1, currentMin);
        }
    }

    public static int FindMin(int[] nums) {
        return FindMinbinarySearch(nums, 0, nums.length - 1, nums[0]);
    }

}
// Pegar mid[i].
// Se mid[i-1] for menor que o atual fazer X:
// Analizar porção anterior do array, passando o menor como sendo mid[i-1],
// right como mid[i], e mid (left + right) / 2

// se mid[i+1] for maior que atual
// Analizar porção adiante do array, passando o menor como sendo mid[i+1], left
// como mid[i] e mid (left + right) / 2