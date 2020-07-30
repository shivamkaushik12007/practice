s=input()
ls=['a','b','c','d','e','f','g','h','i']
res=0
for i in s:
    res=res*10+ls.index(i)+1
rel="YES" if(res%6==0) else "NO"
print(rel)
