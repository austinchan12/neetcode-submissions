class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        ans = []

        count = Counter(nums)

        sorted_dict = dict(sorted(count.items(), key=lambda item: item[1], reverse=True))

        for num in sorted_dict:
            if k > 0:
                ans.append(num)
                k -= 1
            else:
                break

        return ans
