#!/bin/python3

import sys


# Complete the function below.

def superStack(operations):
    arr=list()
    for i in operations:
        k=list(i.split(" "))
        if len(k)==1:
            arr.pop()
        elif len(k)==2:
            arr.append(int(k[1]))
        elif len(k)==3:
            temp=len(arr)
            for i in range(int(k[1])):
                if i>=temp:
                    break
                arr[i]+=int(k[2])
        if(len(arr)==0):
            print("EMPTY")
        else:
            print(arr[len(arr)-1])


if __name__ == "__main__":
    operations_cnt = 0
    operations_cnt = int(input())
    operations_i = 0
    operations = []
    while operations_i < operations_cnt:
        try:
            operations_item = str(input())
        except:
            operations_item = None
        operations.append(operations_item)
        operations_i += 1


    res = superStack(operations);
    

