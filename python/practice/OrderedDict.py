# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import OrderedDict
n=int(input())
arr=OrderedDict()
for i in range(n):
    *na,k=input().split()
    name=" ".join(map(str,na))
    arr[name]=arr[name]+int(k) if(name in arr) else int(k)
for i,j in arr.items():
    print(i+" "+str(j))
