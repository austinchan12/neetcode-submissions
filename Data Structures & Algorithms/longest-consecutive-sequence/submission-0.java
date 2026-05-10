class Solution {
    public int longestConsecutive(int[] nums) {
        // Sort the input array
        Arrays.sort(nums);
        
        System.out.println(Arrays.toString(nums));

        // Handle empty array case
        if (nums.length == 0) return 0;

        int longest = 1;
        int length = 1;

        // Start with the first element
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev + 1) {
                // Increment length if current number is consecutive
                length++;
            } else if (nums[i] != prev) {
                // Reset length if current number is not equal to the previous one
                longest = Math.max(longest, length);
                length = 1; // Reset length for the new sequence
            }
            prev = nums[i]; // Update previous number
        }

        // Final check in case the longest sequence ends at the last element
        longest = Math.max(longest, length);

        return longest;
    }
}