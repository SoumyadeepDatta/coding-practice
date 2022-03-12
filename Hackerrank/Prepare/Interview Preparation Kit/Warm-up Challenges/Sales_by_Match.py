#Sales by Match
#!/bin/python3

'''
STCET CSE 5TH SEM
@author: SOUMYADEEP DATTA
'''

import math
import os
import random
import re
import sys

#
# Complete the 'sockMerchant' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER n
#  2. INTEGER_ARRAY ar
#

def check(n, ar):
    if (n>=1 and n<=100):
        for i in ar:
            if (i>=1 and i<=100):
                pass
            else:
                return False
        return True
    return False

cnt = 0
aux=[]
def sockMerchant(n, ar):
    pair = 0
    if (check(n,ar)):
        for x in ar:
            if x in aux:
                pass
            else:
                cnt = int(ar.count(x))
                pair += cnt // 2
            aux.append(x)
        return pair

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    ar = list(map(int, input().rstrip().split()))[:n]

    result = sockMerchant(n, ar)

    fptr.write(str(result) + '\n')

    fptr.close()
