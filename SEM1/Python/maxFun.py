def maxFun(*argv):
    maxNum = 0
    for num in argv[0]:
        if num > maxNum:
            maxNum = num
    return maxNum


try:
    numbers = []
    numbers.append(int(input("Enter a number : ")))
    while True:
        numbers.append(int(input("Enter a number : ")))
        usrContinue = input("Do you want to continue entering numbers (yes/no): ").lower()
        if usrContinue == "no":
            break
        elif usrContinue != "yes":
            raise ValueError
    print(maxFun(numbers))
except ValueError:
    print("Enter Correct Value")
