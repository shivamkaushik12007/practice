def check(arr,brr,x,p):
    if(x==-1 or p==-1):
        return -1
    if(brr[x]==brr[p] and x!=p):
        return x+1
    return check(arr,brr,arr[x],p)

n,m=input().split(" ")
arr1=list(map(int,input().split(" ")))
brr=list(map(int,input().split(" ")))
# print("-1",end=" ")
arr=[-1]
for i in arr1:
    arr.append(i-1)
for i in range(int(n)):
    print(check(arr,brr,i,i),end=" ")
