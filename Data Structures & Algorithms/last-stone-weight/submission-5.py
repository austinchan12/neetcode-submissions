import heapq
class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        if not stones:
            return 0
        max_heap = [-stone for stone in stones]

        heapq.heapify(max_heap)

        while max_heap and len(max_heap) != 1:
            stone1 = -heapq.heappop(max_heap)
            stone2 = -heapq.heappop(max_heap)

            difference = stone1 - stone2

            if difference != 0:
                heapq.heappush(max_heap, -difference)
        
        return -max_heap[0] if max_heap else 0
            