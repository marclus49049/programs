#Marclus Lopes 20/07/18
#class of emp with name and age find out the max age and print the name of that person

class Emp:
    def __init__(self, name, age):
        self.name = name
        self.age = age
def max(l = []):
    #This fucntion will find the max age in the list
    max = 0
    index = []
    for i in range(len(l)):
        if l[i].age > max:
            max = l[i].ageName
    for i in range(len(l)):
        if l[i].age == max:
            index.append(i)
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
    if len(max)>1:
        print "There are multiple people with max age they are:"
        for i in max:
            print "Age:", my_object[i].age, " Name: ",my_object[i].name
    else:
        print "Max Age is:", my_object[0].age, " Who's Name: ",my_object[0].name
except ValueError:
    print "Enter Correct Input Please :)"
