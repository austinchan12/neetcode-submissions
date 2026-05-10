class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if nums == []:
            return 0
        seen = set()

        for num in nums:
            seen.add(num)

        longest = 1
        for num in seen:
            currseq = 1
            nextnum = num+1
            while nextnum in seen:
                currseq += 1
                nextnum += 1
            longest = max(longest, currseq)
        
        return longest
            