# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import permutations
s,n=input().split()
print("\n".join(sorted(list(map("".join,list(permutations(s,int(n))))))))
# "\n".join(str(map(str,list(permutations(s)))))
