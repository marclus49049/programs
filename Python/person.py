# Marclus Lopes
# Create a program with 3 class Person, Student and teacher and display their
# values approprately


class Person(object):
    def __init__(self, first_name, middle_name, last_name):
        self.first_name = first_name
        self.middle_name = middle_name
        self.last_name = last_name

    def print_name(self):
        return "Name " + self.first_name + " " + self.middle_name + " " + self.last_name


class Student(Person):
    def __init__(self, first_name, middle_name, last_name, subject, marks):
        Person.__init__(self, first_name, middle_name, last_name)
        self.subject = subject
        self.marks = marks

    def print_details(self):
        return "Name " + self.first_name + " " + self.middle_name + " " + self.last_name+"\n\tSubject : " + self.subject + "\n\tMarks: " + self.marks


class Teacher(Person):
    def __init__(self, first_name, middle_name, last_name, designation, phone):
        Person.__init__(self, first_name, middle_name, last_name)
        self.designation = designation
        self.phone = phone

    def print_details(self):
        return "Name " + self.first_name + " " + self.middle_name + " " + self.last_name+"\n\tDesignation : " + self.designation + "\n\tPhone: " + self.phone


classObj = []

classObj.append(Student("fname0", "mnam0", "lname0", "sub", "marks"))
classObj.append(Student("fname1", "mnam1", "lname2", "sub", "marks"))
classObj.append(Student("fname3", "mnam3", "lname3", "sub", "marks"))

classObj.append(Teacher("fname4", "mnam4", "lname4", "designation", "phone1"))
classObj.append(Teacher("fname5", "mnam5", "lname5", "designation", "phone2"))

for objects in classObj:
    print(objects.print_details())
