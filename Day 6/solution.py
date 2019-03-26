# Enter your code here. Read input from STDIN. Print output to STDOUT
N = int(input())
for i in range(0,N):
    S = input()
    even = ""
    odd = ""
    for j in range(0,len(S)):
        if (j%2==0):
            even += S[j]
        else:
            odd += S[j]
    print(even,odd)
