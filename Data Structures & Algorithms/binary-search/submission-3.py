class Solution:
    def search(self, nums: List[int], target: int) -> int:
        def binary_search(target, left, right, arr):
            if left > right:
                return -1
            mid = (left + right) // 2
            if target == arr[mid]:
                return mid
            elif target < arr[mid]:
                return binary_search(target, left, mid - 1, arr)
            else:
                return binary_search(target, mid + 1, right, arr)
        
        return binary_search(target, 0, len(nums) - 1, nums)