class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left = 0
        right = len(heights)-1
        ans = 0

        while not right < left:
            x = right - left
            leftbar = heights[left]
            rightbar = heights[right]
            y = min(leftbar, rightbar)
            ans = max(ans, x*y)
            
            if leftbar < rightbar:
                left += 1
            else:
                right -= 1
        
        return ans