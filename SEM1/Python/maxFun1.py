def maxFun(*argv):
    maxNum = 0
    for arg in argv:
        if type(arg) in (list, tuple):
            num = maxFun(*arg)
            if num > maxNum:
                maxNum = num
        elif type(arg) is int:
            if arg > maxNum:
                maxNum = arg
        elif type(arg) is str:
            if int(arg) > maxNum:
                maxNum = int(arg)
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
    print(maxFun(numbers, 10, 20, '23', [[2], [3]]))
except ValueError:
    print("Enter Correct Value")
