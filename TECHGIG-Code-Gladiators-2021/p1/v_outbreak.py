''' Read input from STDIN. Print your output to STDOUT '''
    #Use input() to read input from STDIN and use print to write your output to STDOUT

b=[]
def solve():
    v = str(input())
    v = v.lower()
    if (len(v)>=1 and len(v)<=10**5):
        n = int(input())
        if (n>=1 and n<=10):
            for i in range (n):
                B=str(input())
                B = B.lower()
                if (len(B)>=1 and len(B)<=len(v)):
                    b.append(str(B))
            for i in range (n):
                if (check(v,str(b[i]))):
                    print("POSITIVE")
                else:
                    print("NEGATIVE")

def check(v,s):
    flag=int()
    x=len(v)
    y=len(s)
    i=0
    j=0
    while i < x and j < y:
        if s[j] == v[i]:
            i += 1
            j += 1
            flag = 1
        else:
            i += 1
            flag = 0
    if (flag == 1 and j == y):
        return True
    else:
        return False    


if __name__ == '__main__':
    solve()