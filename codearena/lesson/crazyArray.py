t=int(input())
for _ in range(t):
    n,x=input().split(" ")
    arr=list(map(int,input().split(" ")))
    k=0
    for i in range(1,len(arr)):
        p=arr[i-1]-arr[i]
        p=p//int(x)
        k+=(p+1)
        arr[i]+=((p+1)*int(x))
    print(k)

