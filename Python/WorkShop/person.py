#1.sorted based on Name, 2. sorted by age, 3. sorted by marks
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age
class Student(Person):
    def __init__(self,name,age, rollNo, marks):
        Person.__init__(self,name,age)
        self.rollNo = rollNo
        self.marks = marks

try:
    my_object = []
    while (True):
        name = raw_input("Enter Name: ")
        age = int(raw_input("Enter Age: "))
        rollNo = int(raw_input("Enter Roll Number: "))
        marks = float(raw_input("Enter Mark: "))
        flag = raw_input("Do you want to enter more values?? yes/no \n>>>")
        my_object.append(Student(name, age, rollNo, marks))
        if flag.lower() == "no":
            break
        if flag.lower() != "yes":
            raise ValueError
        my_object.sort(reverse=True)
    else:
        print "Max Age is:", my_object[0].age, " Who's Name: ",my_object[0].name
except ValueError:
    print "Enter Correct Input Please :)"
