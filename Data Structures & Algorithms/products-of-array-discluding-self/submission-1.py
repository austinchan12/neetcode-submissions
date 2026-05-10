class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ans = []

        #prefix
        ans.append(1)
        pref = 1
        for i, num in enumerate(nums):
            if i == len(nums)-1:
                break
            pref *= num
            ans.append(pref)
    
        #postfix
        #[1,2,4,6]
        #[1,1,2,8]
        #[48,24,6,1]
        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            ans[i] *= postfix
            postfix *= nums[i]
        return ans
