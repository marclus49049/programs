#sum of the multipes is equal to the number
def checkPerfectNum(num):
    sum=0
    l = ""
    for i in range(1,num):
        if num%i==0:
            if sum>num:
                return False
            if(len(l)!=0):
                l = l + " + " +str(i)
            else:
                l = l +str(i)
            sum=sum+i
    if sum!=num:
        return False
    print l," = ",sum
    return True
try:
    num = int(raw_input("Enter an Integer :"))
    if checkPerfectNum(num) is True:
        print num," number is perfect"
    else:
        print num," is not perfect"
except ValueError:
    print("Enter a valid Integer Number")
except OverflowError:
    print("Enter Numbers Between 1 to 100")
