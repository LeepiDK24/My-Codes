n=int(input("Enter n"))
sum=0
while(n!=0):
    ld=n%10
    sum+=ld
    n=n//10

print(sum)