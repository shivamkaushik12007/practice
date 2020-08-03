class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.lower()
        res=""
        for i in s:
            if(i>='a' and i<='z' or i>='0' and i<='9'):
                res+=i
        return res==res[::-1]
