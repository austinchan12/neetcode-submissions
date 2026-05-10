class Solution {

    // Main function called by LeetCode
    public boolean canPartitionKSubsets(int[] nums, int k) {

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;                     // add up all numbers
        }

        // If total sum is not divisible by k, we cannot split evenly
        if (totalSum % k != 0) {
            return false;
        }

        int target = totalSum / k;               // each subset must equal this sum

        // Sort array so we can prune earlier (largest numbers first)
        java.util.Arrays.sort(nums);
        reverse(nums);

        // If the largest number is greater than target, it's impossible
        if (nums[0] > target) {
            return false;
        }

        boolean[] used = new boolean[nums.length]; // tracks which numbers are already used

        // Start backtracking to try forming k subsets
        return backtrack(nums, used, k, 0, 0, target);
    }

    // Helper method to reverse array (Java sorts ascending by default)
    private void reverse(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    // Recursive backtracking function
    private boolean backtrack(
            int[] nums,
            boolean[] used,
            int k,
            int startIndex,
            int currentSum,
            int target
    ) {

        // If only one subset remains, it must be valid
        if (k == 1) {
            return true;
        }

        // If current subset reaches target, start building the next subset
        if (currentSum == target) {
            return backtrack(nums, used, k - 1, 0, 0, target);
        }

        // Try to add unused numbers to the current subset
        for (int i = startIndex; i < nums.length; i++) {

            // Skip numbers that are already used
            if (used[i]) {
                continue;
            }

            // Skip if adding this number would exceed target
            if (currentSum + nums[i] > target) {
                continue;
            }

            // Choose this number
            used[i] = true;

            // Recurse with updated sum
            if (backtrack(nums, used, k, i + 1, currentSum + nums[i], target)) {
                return true;
            }

            // Undo choice (backtrack)
            used[i] = false;
        }

        // No valid subset found from this path
        return false;
    }
}
