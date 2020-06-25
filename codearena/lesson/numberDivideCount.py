n=int(input())
arr=list(map(int,input().split(" ")))
t=int(input())
for _ in range(t):
    k1,k2=input().split(" ")
    n1=int(k1)
    n2=int(k2)
    k=0
    for i in arr:
        if i%n1==0 or i%n2==0:
            k+=1
    print(k)
