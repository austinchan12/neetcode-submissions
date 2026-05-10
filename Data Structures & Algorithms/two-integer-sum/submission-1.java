class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array and populate the map
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            // Check if the map already contains the difference
            if (map.containsKey(diff)) {
                // Return the indices of the two numbers that sum to target
                return new int[] {map.get(diff), i};
            }

            // Add the current number and its index to the map
            map.put(num, i);
        }

        // If no solution is found, return an empty array
        return new int[] {};
    }
}