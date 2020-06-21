def wrapper(f):
    def fun(l):
        # complete the function
        l=list(map(str,l))
        for i in range(len(l)):
            k=len(l[i])
            l[i]="+91 "+l[i][k-10:k-5]+" "+l[i][k-5:k]
        return f(l)
    return fun

@wrapper
def sort_phone(l):
    print(*sorted(l), sep='\n')

if __name__ == '__main__':
    l = [input() for _ in range(int(input()))]
    sort_phone(l) 


