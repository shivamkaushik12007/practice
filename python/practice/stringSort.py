# Enter your code here. Read input from STDIN. Print output to STDOUT
p=input()
s=sorted(p)
odd=""
even=""
cap=""
small=""
for i in range(len(s)):
    if(s[i].isnumeric()):
        if(int(s[i])%2==0):
            even+=s[i]
        else:
            odd+=s[i]
    elif(s[i].islower()):
        small+=s[i]
    else:
        cap+=s[i]
print(small+cap+odd+even)
