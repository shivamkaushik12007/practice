t=int(input())
for _ in range(t):
    n,x=input().split(" ")
    arr=list(input().split(" "))
    s=set(arr)
    if len(s)==int(x):
        print("Good")
    elif len(s)>int(x):
        print("Average")
    else:
        print("Bad")
