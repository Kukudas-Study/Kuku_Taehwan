price = int(input()) 
a=[500,100,50,10,5,1]
zze=1000-price #잔돈

count = 0 #잔돈 갯수 체크

for i in a:
     if zze >= i:#ex1) 620>=500
        count = count + (zze // i) # count = count+1
        zze = zze%i #620%500
   
print(count)