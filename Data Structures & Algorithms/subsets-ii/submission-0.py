class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        
        def dfs(i, subset):
            if i >= len(nums):
                if subset[:] not in res:
                    res.append(subset[:])
                return
            
            subset.append(nums[i])
            dfs(i + 1, subset)

            subset.pop()
            dfs(i + 1, subset)



        dfs(0, [])

        return res