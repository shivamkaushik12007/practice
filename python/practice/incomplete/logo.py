#!/bin/python3

import math
import os
import random
import re
import sys
from collections import Counter
import operator


if __name__ == '__main__':
    s = input()
    arr=Counter(list(s))
    x = sorted(arr.items(), key=operator.itemgetter(0))
    print(x)
    x = sorted(arr.items(), key=operator.itemgetter(1), reverse=True)
    print(x)
    p=len(x) if(len(x)<3) else 3
    k=0
    for i in x:
        if(k>=p):
            break
        print(i[0]+" "+str(i[1]))
        k+=1
# from collections import Counter
# for each in Counter(sorted(input())).most_common(3): print(*each)
