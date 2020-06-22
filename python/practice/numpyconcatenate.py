import numpy

n,m,p=input().split()
arr1=[]
arr2=[]
for _ in range(int(n)):
    temp=numpy.array(input().split(),int)
    arr1.append(temp)
for _ in range(int(m)):
    temp=numpy.array(input().split(),int)
    arr2.append(temp)
print(numpy.concatenate((arr1,arr2),axis=0))
