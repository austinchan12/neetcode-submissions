class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        counts = Counter(nums)

        for num in counts.values():
            if num != 1:
                return True
        return False  