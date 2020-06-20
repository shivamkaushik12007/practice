# Enter your code here. Read input from STDIN. Print output to STDOUT
n,m=input().split()
arr=[[] for _ in range(int(n))]
for _ in range(int(m)):
    temp=list(map(float,input().split()))
    for i in range(int(n)):
        arr[i].append(temp[i])

for _ in range(int(n)):
    # print(arr[_])
    print(sum(arr[_])/len(arr[_]))
