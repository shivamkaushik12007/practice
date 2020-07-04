t=int(input())
for _ in range(t):
    res=0
    n=int(input())
    arr=list(map(int,input().split(" ")))
    while(n>0):
        maxx=0
        maxVal=0
        i=1
        while(i<=n and i<=len(arr)):
            if(arr[i-1]>maxx):
                maxx=arr[i-1]
                maxVal=i
            i+=1
        res+=(n//i)*maxx
        n%=i
    print(res)
