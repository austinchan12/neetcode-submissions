class Solution {
    public int removeElement(int[] nums, int val) {
        int ansCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int temp = ansCount;
                nums[ansCount] = nums[i];
                nums[i] = nums[temp];
                ansCount++;
            }
        }

        return ansCount;
    }
}