from typing import List

class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left = 0
        right = len(heights) - 1
        ans = 0

        while left < right:
            width = right - left
            height = min(heights[left], heights[right])
            area = width * height
            ans = max(ans, area)

            # Move the pointer at the shorter line
            if heights[left] < heights[right]:
                left += 1
            else:
                right -= 1

        return ans
