#Marclus Lopes 20/07/18
#class of emp with name and age find out the max age and print the name of that person

class Emp:
    def __init__(self, name, age):
        self.name = name
        self.age = age

def max(l = []):
    #This fucntion will find the max age in the list
    max = 0
    for i in range(len(l)):
        if l[i].age > max:
            max = l[i].age
            index = i
    return index
try:
    my_object = []
    while (True):
        name = raw_input("Enter your name: ")
        age = int(raw_input("Enter your age: "))
        flag = raw_input("Do you want to enter more values?? yes/no \n>>>")
        my_object.append(Emp(name, age))
        if flag.lower() == "no":
            break
        if flag.lower() != "yes":
            raise ValueError
    max = max(my_object)
    print "The max age is :", my_object[max].age, " who is: ",my_object[max].name
except ValueError:
    print "Enter Correct Input Please :)"
