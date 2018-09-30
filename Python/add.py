def add(a,b):
    if(type(a)==type(b)):
        return a+b
    else:
        return "Enter Correct Data Type"
try:
    print("")
    ab = int(input("What Type do you want to enter \n1.String\n2.Integer\n>>>"))
    if ab >=2 or ab <=1 :
        raise NameError
    num1 = raw_input("Enter First Number: ")
    num2 = raw_input("Enter Second Number: ")
    if ab==2 :
        num1 = int(num1)
        num2 = int(num2)
    print(add(num1, num2))
except SyntaxError:
    print("Enter Some Values");
except TypeError:
    print("Enter Same type of values")
except NameError:
    print("Enter Correct Option")
except ValueError:
    print("Enter Correct DataType")
