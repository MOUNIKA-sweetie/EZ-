#WAP to find given integer is prime or not
num = int(input())
for i in range(2,num):
    if(num%i==0):
        print("not prime")
        break
else:
    print("prime")