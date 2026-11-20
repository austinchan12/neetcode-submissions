from bisect import bisect_left
class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        def calculate_time(piles, rate):
            time = 0
            for pile in piles:
                time += (pile + rate - 1) // rate
            return time

        low = 1
        high = max(piles)

        arr = range(low, high + 1)

        i = bisect_left(arr, True, key = lambda rate: calculate_time(piles, rate) <= h)

        return arr[i]

