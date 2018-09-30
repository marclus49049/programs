# Program to open a file and find unique values like the unique
# command of linux
# Marclus Lopes
# 15/09/18
try:
    file_path = input("Enter path to file >>> ")
    file_opened = open(file_path, "r")  # Will open the file in read mode
    prev_line = ''
    print("Printing Unique Values for file at location", file_path, "\n\n")
    for line in file_opened:
        if line != prev_line:
            print(line, end='')
        prev_line = line
except FileNotFoundError:
    print("File does not exist please enter a correct path")
