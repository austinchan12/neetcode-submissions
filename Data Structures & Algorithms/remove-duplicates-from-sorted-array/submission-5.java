class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int placer = 0;

        for (int comparer = 1; comparer < nums.length; comparer++) {
            if (nums[comparer] != nums[placer]) {
                placer++;
                nums[placer] = nums[comparer];
            }
        }

        return placer + 1;
    }
}
