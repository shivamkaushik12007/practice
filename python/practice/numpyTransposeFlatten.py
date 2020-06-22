import numpy

n,m=input().split()
arr=[]
for _ in range(int(n)):
    temp=numpy.array(input().split(),int)
    arr.append(temp)
print(numpy.transpose(arr))
arr=numpy.array(arr)
print(arr.flatten())
