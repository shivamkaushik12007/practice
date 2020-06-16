# Enter your code here. Read input from STDIN. Print output to STDOUT
n=input()
e=set(map(int,input().split()))
n=input()
f=set(map(int,input().split()))
print(len(e.intersection(f)))
