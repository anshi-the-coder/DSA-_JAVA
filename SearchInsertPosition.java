public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                start = mid + 1; // Move to right half
            } else {
                end = mid - 1; // Move to left half
            }
        }

        return start; // Position to insert if not found
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};

        System.out.println(searchInsert(nums, 5)); // Output: 2
        System.out.println(searchInsert(nums, 2)); // Output: 1
        System.out.println(searchInsert(nums, 7)); // Output: 4
        System.out.println(searchInsert(nums, 0)); // Output: 0
    }
}
