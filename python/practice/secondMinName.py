if __name__ == '__main__':
    n=[]
    s=[]
    for _ in range(int(input())):
        name = input()
        score = float(input())
        n.append(name)
        s.append(score)
    # print(n)
    # print(s)
    mx=min(float(i) for i in s)
    # print(mx)
    sm=max(float(i) for i in s)
    for i in s:
        # print(i)
        if(i<sm and i>mx):
            sm=i
    # print(sm)
    res=[]
    k=0
    for i in s:
        if(i==sm):
            res.append(n[k])
        k+=1
    res.sort()
    # print(res)
    for i in res:
        print(i)
