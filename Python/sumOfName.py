name = raw_input("Enter Name: ")
name = name.upper();
print(name)
sum = 0
for x in name:
    sum = sum + (ord(x)-64)
print (sum)
