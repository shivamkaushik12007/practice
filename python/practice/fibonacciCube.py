cube = lambda x: x*x*x 

def fibonacci(n):
    # return a list of fibonacci numbers
    arr=list()
    if n>0:
        arr.append(0)
    if n>1:
        arr.append(1)
    if n>2:
        arr.append(1)
    k1=1
    k2=1
    if n>3:
        for i in range(3,n):
            arr.append(k1+k2)
            c=k1+k2
            k1=k2
            k2=c
    return arr


if __name__ == '__main__':
    n = int(input())
    print(list(map(cube, fibonacci(n))))
