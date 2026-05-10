import bisect

class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stones.sort()
        while len(stones) > 1:
            a = stones.pop()  # largest
            b = stones.pop()  # second largest
            if a != b:
                bisect.insort(stones, a - b)  # maintain sort
        return stones[0] if stones else 0
