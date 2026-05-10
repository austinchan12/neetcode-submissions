class Solution:
    def rob(self, nums: List[int]) -> int:

        def helper(nums):
            
            rob1, rob2 = 0, 0
            for num in nums:
                rob1, rob2 = rob2, max(rob1 + num, rob2)
            
            return rob2

        return max(nums[0], helper(nums[1:]), helper(nums[:len(nums)-1]))