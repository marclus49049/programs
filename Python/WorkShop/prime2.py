'''
19/07/18
Marclus Lopes
A program to find pime numbers between a certain range
'''
#accept a number and check if its prime or not

def checkPrime(num):
    flag = 1 #True Flag (Prime)
    for j in range(2,num):
        if num%j==0:
            flag = 0 #False Flag (Not Prime)
            break
    return(flag)

#Main program starts here

while (True):
    try:
        print("\nEnter Integer Number only")
        number = int(raw_input("Enter a Number from 1 to 100: "))
        if number < 0 or number > 50000:
            raise OverflowError
        cnt = 0
        i = 1
        if number > 1:
            print "The first ",number," prime numbers are:"
        else:
            print "The first prime number is:"
        while number>cnt:
            if checkPrime(i)!=0:
                print i
                cnt+=1
            i+=1
        break
    except ValueError:
        print("Enter a valid Integer Number")
    except OverflowError:
        print("Enter Numbers Between 1 to 100")
