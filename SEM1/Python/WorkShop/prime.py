#accept a number and check if its prime or not

def checkPrime(num):
    flag = 1
    for j in range(2,num):
        if num%j==0:
            flag = 0
            break
    return(flag)

while (True):
    try:
        print("\nEnter Integer Number only")
        number = int(raw_input("Enter a Number: "))
        if number < 0 or number > 100:
            raise OverflowError
        if checkPrime(number)==0:
            print("Number is not prime Number")
        else:
            print("Number is prime Number")
        break
    except ValueError:
        print("Enter a number")
    except OverflowError:
        print("Enter Numbers Between 1 to 100")
