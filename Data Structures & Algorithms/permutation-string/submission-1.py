class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        s1_representation = [0] * 1000
        s2_representation = [0] * 1000

        if len(s2) < len(s1):
            return False
            
        for char in s1:
            s1_representation[ord(char)] += 1

        s2_left = 0
        s2_right = len(s1)

        for _ in range(len(s1)):
            s2_representation[ord(s2[s2_left])] += 1
            s2_left += 1
        
        s2_left = 0

        while s2_right < len(s2):
            if s2_representation == s1_representation:
                return True
            s2_representation[ord(s2[s2_right])] += 1
            s2_representation[ord(s2[s2_left])] -= 1
            s2_right += 1
            s2_left += 1

        return s2_representation == s1_representation