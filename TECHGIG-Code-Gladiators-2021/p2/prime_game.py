from math import *

a = list()

def isprime(n):
    if (n==1):
        return False
    if (n==2):
        return True
    for i in range (2,int(ceil(sqrt(n)))+1):
        if n % i == 0:
            return False
            break
    return True


def solve():
    l,r = map(int, input().split())
    if (r>=2 and r<=10**6):
        if(l>=2 and l<=r):
            f_start = 0
            f_end = 0
            
            for i in range (l,r+1):
                if (isprime(i)):
                    f_start = i
                    break
            if (f_start == 0):
                a.append(int(-1))
                return
            for i in range (r,l-1,-1):
                if (isprime(i)):
                    f_end = i
                    break
            # if (f_start == 0):
            #     a.append(int(-1))
            #     return
            if (f_start == f_end):
                a.append(int(0))
                return
            else:
                a.append(int(f_end - f_start))




if __name__=="__main__":
    t=int(input())
    if (t>=1 and t <=10):
        for i in range (t):
            solve()
    for i in a:
        print(i)
