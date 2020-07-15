class Solution:
    def reverseWords(self, s: str) -> str:
        arr=s.split(" ")
        arr=arr[::-1]
        res=""
        for i in arr:
            res+=i.strip()+" " if(len(i.strip())>0) else ""
        # print(res)
        return res.strip()
