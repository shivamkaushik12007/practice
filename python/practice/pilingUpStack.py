# Enter your code here. Read input from STDIN. Print output to STDOUT
# from math import pow
n=int(input())
for _ in range(n):
    k=int(input())
    arr=list(map(int,input().split()))
    i,j=0,len(arr)-1
    no=False
    s=pow(2,31)+1
    while(not i==j):
        k=arr[i] if(arr[i]>arr[j]) else arr[j]
        # print(k)
        if(k<=s):
            s=k
            if(arr[i]==k):
                i+=1
            else:
                j=j-1
        else:
            no=True
            break
    if(no):
        print("No")
    else:
        print("Yes")
