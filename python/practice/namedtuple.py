# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import namedtuple
n=int(input())
res=0
Data=  namedtuple("Data",input().split())
# res = sum([int(Data._make(input().split()).MARKS) for _ in range(n)])
for i in range(n):
    temp=Data._make(input().split())
    res+=int(temp.MARKS)
print(res/n)
