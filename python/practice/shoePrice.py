# Enter your code here. Read input from STDIN. Print output to STDOUT
n=int(input())
arr=list(input().split())
n=int(input())
res=0
for i in range(n):
    t1,t2=input().split()
    if(t1 in arr):
        arr.remove(t1)
        res+=int(t2)
print(res)
