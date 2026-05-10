class Solution:
    def isPalindrome(self, s: str) -> bool:
        s.split(" ")
        cleaned = ''.join(char for char in s if char.isalnum())
        cleaned = cleaned.lower()
        print(cleaned)
        print(cleaned[::-1])
        return cleaned == cleaned[::-1]