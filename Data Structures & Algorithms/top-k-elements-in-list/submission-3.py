class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = Counter(nums)
        ans = []

        '''
        [1,1,2,2,2,3,3,3,3]
        (1:2, 2:3, 3:4)
        '''
        
        arr = [[] for _ in range(len(nums) + 1)]

        for key, value in count.items():
            arr[value].append(key)
        
        for numbers in arr[::-1]:
            i = 0
            for num in numbers:
                if k > 0:
                    ans.append(numbers[i])
                    k -= 1
                    i += 1
                else:
                    break

        return ans
        




