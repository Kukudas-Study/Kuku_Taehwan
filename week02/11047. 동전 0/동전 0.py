N,K = map(int, input().split())

A = [int(input()) for _ in range(N)]
A.sort(reverse=True)#설명 필요
count=0


for i in A:
    if K>=i:
        count = count+K//i
        K = K%i
        
print(count)