class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res = []

        def dfs(path, available):
            if not available:  # no numbers left to pick
                res.append(path[:])
                return

            for num in list(available):  # iterate over a snapshot
                available.remove(num)
                path.append(num)

                dfs(path, available)

                # backtrack
                path.pop()
                available.add(num)

        dfs([], set(nums))
        return res
