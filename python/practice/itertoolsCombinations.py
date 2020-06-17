# Enter your code here. Read input from STDIN. Print output to STDOUT
# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import combinations
s,n=input().split()
s="".join(sorted(s))
for i in range(1,int(n)+1):
    print("\n".join(sorted(list(map("".join,list(combinations(s,i)))))))
# "\n".join(str(map(str,list(permutations(s)))))
