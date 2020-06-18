from collections import deque
n=int(input())
arr=deque()
for i in range(n):
    l =list(input().split())
    k="arr."+l[0]+"("
    k+=l[1]+")" if len(l)>1 else ")"
    eval(k)
print(" ".join(list(map(str,arr))))
